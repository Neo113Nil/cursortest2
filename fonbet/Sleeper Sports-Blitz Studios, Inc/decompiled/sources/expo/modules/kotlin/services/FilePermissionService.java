package expo.modules.kotlin.services;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: FilePermissionService.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\nH\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u0010"}, d2 = {"Lexpo/modules/kotlin/services/FilePermissionService;", "Lexpo/modules/kotlin/services/Service;", "<init>", "()V", "getPathPermissions", "Ljava/util/EnumSet;", "Lexpo/modules/kotlin/services/FilePermissionService$Permission;", "context", "Landroid/content/Context;", "path", "", "getInternalPathPermissions", "getExternalPathPermissions", "getInternalPaths", "", "Permission", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class FilePermissionService implements Service {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FilePermissionService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/services/FilePermissionService$Permission;", "", "<init>", "(Ljava/lang/String;I)V", "READ", "WRITE", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Permission {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Permission[] $VALUES;
        public static final Permission READ = new Permission("READ", 0);
        public static final Permission WRITE = new Permission("WRITE", 1);

        private static final /* synthetic */ Permission[] $values() {
            return new Permission[]{READ, WRITE};
        }

        public static EnumEntries<Permission> getEntries() {
            return $ENTRIES;
        }

        private Permission(String str, int i) {
        }

        static {
            Permission[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Permission valueOf(String str) {
            return (Permission) Enum.valueOf(Permission.class, str);
        }

        public static Permission[] values() {
            return (Permission[]) $VALUES.clone();
        }
    }

    public EnumSet<Permission> getPathPermissions(Context context, String path) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        EnumSet<Permission> internalPathPermissions = getInternalPathPermissions(path, context);
        return internalPathPermissions == null ? getExternalPathPermissions(path) : internalPathPermissions;
    }

    private final EnumSet<Permission> getInternalPathPermissions(String path, Context context) {
        Object obj;
        try {
            String canonicalPath = new File(path).getCanonicalPath();
            Iterator<T> it = getInternalPaths(context).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String str = (String) obj;
                Intrinsics.checkNotNull(canonicalPath);
                if (StringsKt.startsWith$default(canonicalPath, str + "/", false, 2, (Object) null) || Intrinsics.areEqual(str, canonicalPath)) {
                    break;
                }
            }
            if (((String) obj) != null) {
                return EnumSet.of(Permission.READ, Permission.WRITE);
            }
            return null;
        } catch (IOException unused) {
            return EnumSet.noneOf(Permission.class);
        }
    }

    protected EnumSet<Permission> getExternalPathPermissions(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path);
        EnumSet<Permission> noneOf = EnumSet.noneOf(Permission.class);
        if (file.canRead()) {
            noneOf.add(Permission.READ);
        }
        if (file.canWrite()) {
            noneOf.add(Permission.WRITE);
        }
        Intrinsics.checkNotNullExpressionValue(noneOf, "apply(...)");
        return noneOf;
    }

    private final List<String> getInternalPaths(Context context) throws IOException {
        return CollectionsKt.listOf((Object[]) new String[]{context.getFilesDir().getCanonicalPath(), context.getCacheDir().getCanonicalPath()});
    }
}
