package m90;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: m90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8110a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: m90.a$a, reason: collision with other inner class name */
    public static final class EnumC1263a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC1263a[] $VALUES;
        public static final EnumC1263a CLICK;
        public static final EnumC1263a PAGE_VIEW;
        public static final EnumC1263a VIEW;

        static {
            EnumC1263a enumC1263a = new EnumC1263a("CLICK", 0);
            CLICK = enumC1263a;
            EnumC1263a enumC1263a2 = new EnumC1263a("PAGE_VIEW", 1);
            PAGE_VIEW = enumC1263a2;
            EnumC1263a enumC1263a3 = new EnumC1263a("VIEW", 2);
            VIEW = enumC1263a3;
            EnumC1263a[] enumC1263aArr = {enumC1263a, enumC1263a2, enumC1263a3};
            $VALUES = enumC1263aArr;
            $ENTRIES = Xc.b.a(enumC1263aArr);
        }

        private EnumC1263a() {
            throw null;
        }

        public static EnumC1263a valueOf(String str) {
            return (EnumC1263a) Enum.valueOf(EnumC1263a.class, str);
        }

        public static EnumC1263a[] values() {
            return (EnumC1263a[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ void sendEvent$default(C8110a c8110a, EnumC1263a enumC1263a, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        if ((i11 & 16) != 0) {
            str4 = null;
        }
        if ((i11 & 32) != 0) {
            str5 = null;
        }
        if ((i11 & 64) != 0) {
            str6 = null;
        }
        c8110a.sendEvent(enumC1263a, str, str2, str3, str4, str5, str6);
    }

    public void beginTotalTimeTrace(@NotNull String url, @NotNull String pageType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(pageType, "pageType");
    }

    public void dispatch() {
    }

    public void endTotalTimeTrace(@NotNull String url, boolean z11, String str, List<b> list) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public void sendAllPerfAnalytics() {
    }

    public void sendEvent(@NotNull EnumC1263a actionType, String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
    }

    public void sendPageView() {
    }

    public void setPageView(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public void updateUserId(String str) {
    }
}
