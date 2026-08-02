package Ub;

import com.henninghall.date_picker.pickers.a;

/* loaded from: classes3.dex */
public class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Tb.f f12145a;

    /* renamed from: Ub.a$a, reason: collision with other inner class name */
    public class C0253a implements a.InterfaceC0537a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Vb.g f12146a;

        public C0253a(Vb.g gVar) {
            this.f12146a = gVar;
        }

        @Override // com.henninghall.date_picker.pickers.a.InterfaceC0537a
        public void a() {
            a.this.f12145a.a(this.f12146a);
        }

        @Override // com.henninghall.date_picker.pickers.a.InterfaceC0537a
        public void b() {
            a.this.f12145a.b(this.f12146a);
        }
    }

    public a(Tb.f fVar) {
        this.f12145a = fVar;
    }

    @Override // Ub.h
    public void a(Vb.g gVar) {
        gVar.f12856d.setOnValueChangedListener(new C0253a(gVar));
    }
}
