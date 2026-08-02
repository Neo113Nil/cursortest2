package Vc;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class e extends d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f12866c = new a(null);

    public static final class a implements Pc.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Pc.b
        public String a() {
            return "onNativeDismissPrevented";
        }

        @Override // Pc.b
        public String getEventName() {
            return "topNativeDismissPrevented";
        }

        public a() {
        }
    }

    public e(int i10, int i11) {
        super(i10, i11, "topNativeDismissPrevented", "onNativeDismissPrevented");
    }
}
