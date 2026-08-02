package Vc;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a extends d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0266a f12860c = new C0266a(null);

    /* renamed from: Vc.a$a, reason: collision with other inner class name */
    public static final class C0266a implements Pc.b {
        public /* synthetic */ C0266a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Pc.b
        public String a() {
            return "onDidAppear";
        }

        @Override // Pc.b
        public String getEventName() {
            return "topDidAppear";
        }

        public C0266a() {
        }
    }

    public a(int i10, int i11) {
        super(i10, i11, "topDidAppear", "onDidAppear");
    }
}
