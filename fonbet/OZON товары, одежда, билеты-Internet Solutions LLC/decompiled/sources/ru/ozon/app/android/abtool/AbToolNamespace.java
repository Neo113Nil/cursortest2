package ru.ozon.app.android.abtool;

import Xc.a;
import Xc.b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/abtool/AbToolNamespace;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "PLATFORM_MOBILE", "Companion", "abzone-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbToolNamespace {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AbToolNamespace[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AbToolNamespace DEFAULT = new AbToolNamespace("DEFAULT", 0);
    public static final AbToolNamespace PLATFORM_MOBILE = new AbToolNamespace("PLATFORM_MOBILE", 1);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/abtool/AbToolNamespace$Companion;", "", "<init>", "()V", "fromStringOrDefault", "Lru/ozon/app/android/abtool/AbToolNamespace;", "namespace", "", "abzone-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AbToolNamespace fromStringOrDefault(@NotNull String namespace) {
            Object obj;
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Iterator<E> it = AbToolNamespace.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (h.D(((AbToolNamespace) obj).name(), namespace, true)) {
                    break;
                }
            }
            AbToolNamespace abToolNamespace = (AbToolNamespace) obj;
            return abToolNamespace == null ? AbToolNamespace.DEFAULT : abToolNamespace;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ AbToolNamespace[] $values() {
        return new AbToolNamespace[]{DEFAULT, PLATFORM_MOBILE};
    }

    static {
        AbToolNamespace[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
    }

    private AbToolNamespace(String str, int i11) {
    }

    @NotNull
    public static a<AbToolNamespace> getEntries() {
        return $ENTRIES;
    }

    public static AbToolNamespace valueOf(String str) {
        return (AbToolNamespace) Enum.valueOf(AbToolNamespace.class, str);
    }

    public static AbToolNamespace[] values() {
        return (AbToolNamespace[]) $VALUES.clone();
    }
}
