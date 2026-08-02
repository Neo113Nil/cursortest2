package eh;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: eh.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4208c {
    JANUARY("Jan"),
    FEBRUARY("Feb"),
    MARCH("Mar"),
    APRIL("Apr"),
    MAY("May"),
    JUNE("Jun"),
    JULY("Jul"),
    AUGUST("Aug"),
    SEPTEMBER("Sep"),
    OCTOBER("Oct"),
    NOVEMBER("Nov"),
    DECEMBER("Dec");


    /* renamed from: b, reason: collision with root package name */
    public static final a f46042b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f46055a;

    /* renamed from: eh.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC4208c a(int i10) {
            return EnumC4208c.values()[i10];
        }

        public a() {
        }
    }

    EnumC4208c(String str) {
        this.f46055a = str;
    }
}
