package fi;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import ei.AbstractC4212b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fi.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4302s extends C4298n {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC4212b f46782c;

    /* renamed from: d, reason: collision with root package name */
    public int f46783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4302s(InterfaceC4306w writer, AbstractC4212b json) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f46782c = json;
    }

    @Override // fi.C4298n
    public void b() {
        o(true);
        this.f46783d++;
    }

    @Override // fi.C4298n
    public void c() {
        o(false);
        k(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        int i10 = this.f46783d;
        for (int i11 = 0; i11 < i10; i11++) {
            k(this.f46782c.f().n());
        }
    }

    @Override // fi.C4298n
    public void d() {
        if (a()) {
            o(false);
        } else {
            c();
        }
    }

    @Override // fi.C4298n
    public void p() {
        f(' ');
    }

    @Override // fi.C4298n
    public void q() {
        this.f46783d--;
    }
}
