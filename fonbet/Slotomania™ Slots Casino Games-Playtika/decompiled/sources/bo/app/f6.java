package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.braze.Constants;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.WebContentUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\nH\u0007R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f8AX\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0015"}, d2 = {"Lbo/app/f6;", "Lbo/app/r2;", "", "Lbo/app/y2;", "triggeredActions", "", Constants.BRAZE_PUSH_CONTENT_KEY, "triggeredAction", "", "", "Lbo/app/r4;", "remotePath", "", "remoteToLocalAssetsMap", "Ljava/util/Map;", "()Ljava/util/Map;", "Landroid/content/Context;", "context", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class f6 implements r2 {
    public static final a e = new a(null);
    private final SharedPreferences a;
    private final Map<String, String> b;
    private final Map<String, String> c;
    private final File d;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s4.values().length];
            iArr[s4.ZIP.ordinal()] = 1;
            iArr[s4.IMAGE.ordinal()] = 2;
            iArr[s4.FILE.ordinal()] = 3;
            a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Storing local triggered action html zip asset at local path " + ((Object) this.b) + " for remote path " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to store html zip asset for remote path " + this.b + ". Not storing local asset";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Could not download ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ Map<String, String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Map<String, String> map) {
            super(0);
            this.b = str;
            this.c = map;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not caching " + this.b + " due to headers " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ Uri b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Uri uri, String str) {
            super(0);
            this.b = uri;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Storing local triggered action asset at local path " + ((Object) this.b.getPath()) + " for remote path " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to store asset for remote path " + this.b + ". Not storing local asset";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        final /* synthetic */ y2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(y2 y2Var) {
            super(0);
            this.b = y2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Prefetch is turned off for this triggered action. Not retrieving local asset paths. Action id: ", this.b.getB());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Found local asset at path " + ((Object) this.b) + " for remote asset at path: " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Could not find local asset for remote path ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        final /* synthetic */ y2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(y2 y2Var) {
            super(0);
            this.b = y2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("No local assets found for action id: ", this.b.getB());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Adding new local path '" + ((Object) this.b) + "' for remote path '" + this.c + "' to cache.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to add new local path for remote path ", this.b);
        }
    }

    public f6(Context context, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.triggers.local_assets.", apiKey), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ey, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
        this.b = e.a(sharedPreferences);
        this.c = new LinkedHashMap();
        this.d = new File(Intrinsics.stringPlus(context.getCacheDir().getPath(), "/ab_triggers"));
    }

    public final Map<String, String> a() {
        return this.b;
    }

    @Override // bo.app.w2
    public void a(List<? extends y2> triggeredActions) {
        String a2;
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        a aVar = e;
        Pair<Set<r4>, Set<String>> a3 = aVar.a(triggeredActions);
        Set<r4> component1 = a3.component1();
        Set<String> component2 = a3.component2();
        SharedPreferences.Editor localAssetEditor = this.a.edit();
        Intrinsics.checkNotNullExpressionValue(localAssetEditor, "localAssetEditor");
        aVar.a(localAssetEditor, this.b, component2, this.c);
        aVar.a(this.d, this.b, this.c);
        ArrayList<r4> arrayList = new ArrayList();
        for (Object obj : component1) {
            if (!a().containsKey(((r4) obj).getB())) {
                arrayList.add(obj);
            }
        }
        for (r4 r4Var : arrayList) {
            String b2 = r4Var.getB();
            try {
                a2 = a(r4Var);
            } catch (Exception e2) {
                e = e2;
            }
            if (a2 != null && !StringsKt.isBlank(a2)) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new m(a2, b2), 3, (Object) null);
                    a().put(b2, a2);
                    localAssetEditor.putString(b2, a2);
                } catch (Exception e3) {
                    e = e3;
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new n(b2));
                }
            }
        }
        localAssetEditor.apply();
    }

    @Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J8\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0007J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007JF\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0010\u0010\u0005\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\tH\u0007J.\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001b0\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0007J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0007R\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006%"}, d2 = {"Lbo/app/f6$a;", "", "Landroid/content/Context;", "context", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Ljava/io/File;", "triggeredAssetDirectory", "", "", "remoteToLocalAssetsMap", "preservedLocalAssetMap", "Landroid/content/SharedPreferences;", "storagePrefs", "", "Landroid/content/SharedPreferences$Editor;", "editor", "localAssetPaths", "", "newRemotePathStrings", "preservedLocalAssetPathMap", "path", "", "", "Lbo/app/y2;", "triggeredActions", "Lkotlin/Pair;", "", "Lbo/app/r4;", "remoteAssetUrl", "b", "EXPIRES_HEADER", "Ljava/lang/String;", "LOCAL_ASSETS_FILE_PREFIX", "TRIGGERS_ASSETS_FOLDER", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: bo.app.f6$a$a, reason: collision with other inner class name */
        static final class C0074a extends Lambda implements Function0<String> {
            final /* synthetic */ File[] b;

            @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/io/File;", "kotlin.jvm.PlatformType", "it", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/io/File;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 6, 0})
            /* renamed from: bo.app.f6$a$a$a, reason: collision with other inner class name */
            static final class C0075a extends Lambda implements Function1<File, CharSequence> {
                public static final C0075a b = new C0075a();

                C0075a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CharSequence invoke(File file) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "it.name");
                    return name;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0074a(File[] fileArr) {
                super(0);
                this.b = fileArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Local triggered asset directory contains files: ", ArraysKt.joinToString$default(this.b, " , ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C0075a.b, 30, (Object) null));
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            final /* synthetic */ File b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(File file) {
                super(0);
                this.b = file;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Deleting obsolete asset '" + ((Object) this.b.getPath()) + "' from filesystem.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class c extends Lambda implements Function0<String> {
            public static final c b = new c();

            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Exception while deleting obsolete assets from filesystem.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class d extends Lambda implements Function0<String> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Not removing local path for remote path " + ((Object) this.b) + " from cache because it is being preserved until the end of the app run.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class e extends Lambda implements Function0<String> {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Removing obsolete local path " + ((Object) this.b) + " for obsolete remote path " + ((Object) this.c) + " from cache.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class f extends Lambda implements Function0<String> {
            final /* synthetic */ File b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(File file) {
                super(0);
                this.b = file;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Deleting triggers directory at: ", this.b.getAbsolutePath());
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class g extends Lambda implements Function0<String> {
            final /* synthetic */ Ref.ObjectRef<String> b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(Ref.ObjectRef<String> objectRef, String str) {
                super(0);
                this.b = objectRef;
                this.c = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Using file extension " + this.b.element + " for remote asset url: " + this.c;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class h extends Lambda implements Function0<String> {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Retrieving trigger local asset path '" + ((Object) this.b) + "' from local storage for remote path '" + ((Object) this.c) + '\'';
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class i extends Lambda implements Function0<String> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Encountered unexpected exception while parsing stored triggered action local assets on remote asset '" + ((Object) this.b) + '\'';
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class j extends Lambda implements Function0<String> {
            final /* synthetic */ y2 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(y2 y2Var) {
                super(0);
                this.b = y2Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Pre-fetch off for triggered action " + this.b.getB() + ". Not pre-fetching assets.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class k extends Lambda implements Function0<String> {
            final /* synthetic */ y2 b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(y2 y2Var, String str) {
                super(0);
                this.b = y2Var;
                this.c = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Received new remote path for triggered action " + this.b.getB() + " at " + this.c + '.';
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            File file = new File(context.getCacheDir(), "ab_triggers");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new f(file), 2, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(file);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object, java.lang.String] */
        public final String b(String remoteAssetUrl) {
            String lastPathSegment;
            int lastIndexOf$default;
            Intrinsics.checkNotNullParameter(remoteAssetUrl, "remoteAssetUrl");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            Uri parse = Uri.parse(remoteAssetUrl);
            if (parse != null && (lastPathSegment = parse.getLastPathSegment()) != null && lastPathSegment.length() != 0 && (lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) lastPathSegment, '.', 0, false, 6, (Object) null)) > -1) {
                ?? substring = lastPathSegment.substring(lastIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                objectRef.element = substring;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f6.e, BrazeLogger.Priority.V, (Throwable) null, new g(objectRef, remoteAssetUrl), 2, (Object) null);
            }
            return IntentUtils.getRequestCode() + ((String) objectRef.element);
        }

        public final void a(File triggeredAssetDirectory, Map<String, String> remoteToLocalAssetsMap, Map<String, String> preservedLocalAssetMap) {
            Intrinsics.checkNotNullParameter(triggeredAssetDirectory, "triggeredAssetDirectory");
            Intrinsics.checkNotNullParameter(remoteToLocalAssetsMap, "remoteToLocalAssetsMap");
            Intrinsics.checkNotNullParameter(preservedLocalAssetMap, "preservedLocalAssetMap");
            File[] listFiles = triggeredAssetDirectory.listFiles();
            if (listFiles == null) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new C0074a(listFiles), 2, (Object) null);
            try {
                ArrayList arrayList = new ArrayList();
                int length = listFiles.length;
                int i2 = 0;
                while (i2 < length) {
                    File file = listFiles[i2];
                    i2++;
                    if (!remoteToLocalAssetsMap.containsValue(file.getPath())) {
                        arrayList.add(file);
                    }
                }
                ArrayList<File> arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!preservedLocalAssetMap.containsValue(((File) obj).getPath())) {
                        arrayList2.add(obj);
                    }
                }
                for (File obsoleteFile : arrayList2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f6.e, (BrazeLogger.Priority) null, (Throwable) null, new b(obsoleteFile), 3, (Object) null);
                    Intrinsics.checkNotNullExpressionValue(obsoleteFile, "obsoleteFile");
                    BrazeFileUtils.deleteFileOrDirectory(obsoleteFile);
                }
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, c.b);
            }
        }

        public final Map<String, String> a(SharedPreferences storagePrefs) {
            String string;
            Intrinsics.checkNotNullParameter(storagePrefs, "storagePrefs");
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            Map<String, ?> all = storagePrefs.getAll();
            if (all == null || all.isEmpty()) {
                return concurrentHashMap;
            }
            for (String remoteAssetKey : all.keySet()) {
                try {
                    string = storagePrefs.getString(remoteAssetKey, null);
                } catch (Exception e2) {
                    e = e2;
                }
                if (string != null && !StringsKt.isBlank(string)) {
                    try {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(string, remoteAssetKey), 3, (Object) null);
                        Intrinsics.checkNotNullExpressionValue(remoteAssetKey, "remoteAssetKey");
                        concurrentHashMap.put(remoteAssetKey, string);
                    } catch (Exception e3) {
                        e = e3;
                        BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new i(remoteAssetKey));
                    }
                }
            }
            return concurrentHashMap;
        }

        public final void a(SharedPreferences.Editor editor, Map<String, String> localAssetPaths, Set<String> newRemotePathStrings, Map<String, String> preservedLocalAssetPathMap) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            Intrinsics.checkNotNullParameter(localAssetPaths, "localAssetPaths");
            Intrinsics.checkNotNullParameter(newRemotePathStrings, "newRemotePathStrings");
            Intrinsics.checkNotNullParameter(preservedLocalAssetPathMap, "preservedLocalAssetPathMap");
            Iterator it = new HashSet(localAssetPaths.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (preservedLocalAssetPathMap.containsKey(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(str), 3, (Object) null);
                } else if (!newRemotePathStrings.contains(str)) {
                    localAssetPaths.remove(str);
                    editor.remove(str);
                    String str2 = localAssetPaths.get(str);
                    if (str2 != null && !StringsKt.isBlank(str2)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(str2, str), 3, (Object) null);
                        BrazeFileUtils.deleteFileOrDirectory(new File(str2));
                    }
                }
            }
        }

        public final boolean a(String path) {
            Intrinsics.checkNotNullParameter(path, "path");
            return new File(path).exists();
        }

        public final Pair<Set<r4>, Set<String>> a(List<? extends y2> triggeredActions) {
            Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (y2 y2Var : triggeredActions) {
                if (!y2Var.getD()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(y2Var), 3, (Object) null);
                } else {
                    for (r4 r4Var : y2Var.b()) {
                        String b2 = r4Var.getB();
                        if (!StringsKt.isBlank(b2)) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new k(y2Var, b2), 3, (Object) null);
                            linkedHashSet.add(r4Var);
                            linkedHashSet2.add(b2);
                        }
                    }
                }
            }
            return new Pair<>(linkedHashSet, linkedHashSet2);
        }
    }

    @Override // bo.app.r2
    public Map<String, String> a(y2 triggeredAction) {
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        if (!triggeredAction.getD()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new i(triggeredAction), 3, (Object) null);
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<r4> it = triggeredAction.b().iterator();
        while (it.hasNext()) {
            String b2 = it.next().getB();
            String str = this.b.get(b2);
            if (str != null && e.a(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(str, b2), 3, (Object) null);
                this.c.put(b2, str);
                linkedHashMap.put(b2, str);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new k(b2), 2, (Object) null);
            }
        }
        if (linkedHashMap.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new l(triggeredAction), 2, (Object) null);
        }
        return linkedHashMap;
    }

    public final String a(r4 remotePath) {
        Long a2;
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        String b2 = remotePath.getB();
        int i2 = b.a[remotePath.getA().ordinal()];
        if (i2 == 1) {
            String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(this.d, b2);
            if (localHtmlUrlFromRemoteUrl != null && !StringsKt.isBlank(localHtmlUrlFromRemoteUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new c(localHtmlUrlFromRemoteUrl, b2), 2, (Object) null);
                return localHtmlUrlFromRemoteUrl;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(b2), 3, (Object) null);
            return null;
        }
        if (i2 != 2 && i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String b3 = e.b(b2);
        try {
            String file = this.d.toString();
            Intrinsics.checkNotNullExpressionValue(file, "triggeredAssetDirectory.toString()");
            Pair downloadFileToPath$default = BrazeFileUtils.downloadFileToPath$default(file, b2, b3, null, 8, null);
            File file2 = (File) downloadFileToPath$default.component1();
            Map map = (Map) downloadFileToPath$default.component2();
            String str = (String) map.get("expires");
            if (str != null && (a2 = v1.a(str)) != null && a2.longValue() <= 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(b2, map), 3, (Object) null);
                return null;
            }
            Uri fromFile = Uri.fromFile(file2);
            if (fromFile != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new g(fromFile, b2), 2, (Object) null);
                return fromFile.getPath();
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(b2), 3, (Object) null);
            return null;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new e(b2));
            return null;
        }
    }
}
