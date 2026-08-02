package Rf;

import Gb.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @NotNull
    public static final C0198a Companion;

    @c("landed_on_site")
    public static final a LandedOnApp = new a("LandedOnApp", 0);

    @c("access_any_page_on_website")
    public static final a AccessedAnyPageOnApp = new a("AccessedAnyPageOnApp", 1);

    @c("clicked")
    public static final a Clicked = new a("Clicked", 2);

    @c("performs_custom_action")
    public static final a PerformedCustomAction = new a("PerformedCustomAction", 3);

    @c("restart")
    public static final a Restart = new a("Restart", 4);

    /* renamed from: Rf.a$a, reason: collision with other inner class name */
    public static final class C0198a {

        /* renamed from: Rf.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0199a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.LandedOnApp.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.AccessedAnyPageOnApp.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.Clicked.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.PerformedCustomAction.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.Restart.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ C0198a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str) {
            if (str == null) {
                return null;
            }
            switch (str.hashCode()) {
                case -1440781774:
                    if (str.equals("landed_on_site")) {
                        return a.LandedOnApp;
                    }
                    return null;
                case 860524583:
                    if (str.equals("clicked")) {
                        return a.Clicked;
                    }
                    return null;
                case 1848670781:
                    if (str.equals("access_any_page_on_website")) {
                        return a.AccessedAnyPageOnApp;
                    }
                    return null;
                case 1908029047:
                    if (str.equals("performs_custom_action")) {
                        return a.PerformedCustomAction;
                    }
                    return null;
                default:
                    return null;
            }
        }

        public final String b(a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            int i10 = C0199a.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i10 == 1) {
                return "landed_on_site";
            }
            if (i10 == 2) {
                return "access_any_page_on_website";
            }
            if (i10 == 3) {
                return "clicked";
            }
            if (i10 == 4) {
                return "performs_custom_action";
            }
            if (i10 == 5) {
                return "restart";
            }
            throw new NoWhenBranchMatchedException();
        }

        public C0198a() {
        }
    }

    private static final /* synthetic */ a[] $values() {
        return new a[]{LandedOnApp, AccessedAnyPageOnApp, Clicked, PerformedCustomAction, Restart};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        Companion = new C0198a(null);
    }

    private a(String str, int i10) {
    }

    @JvmStatic
    @Nullable
    public static final a from(@Nullable String str) {
        return Companion.a(str);
    }

    @NotNull
    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    @NotNull
    public static final String toRawValue(@NotNull a aVar) {
        return Companion.b(aVar);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
