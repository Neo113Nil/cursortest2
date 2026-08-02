package eh;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: eh.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4209d {
    MONDAY("Mon"),
    TUESDAY("Tue"),
    WEDNESDAY("Wed"),
    THURSDAY("Thu"),
    FRIDAY("Fri"),
    SATURDAY("Sat"),
    SUNDAY("Sun");


    /* renamed from: b, reason: collision with root package name */
    public static final a f46056b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f46064a;

    /* renamed from: eh.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC4209d a(int i10) {
            return EnumC4209d.values()[i10];
        }

        public a() {
        }
    }

    EnumC4209d(String str) {
        this.f46064a = str;
    }
}
