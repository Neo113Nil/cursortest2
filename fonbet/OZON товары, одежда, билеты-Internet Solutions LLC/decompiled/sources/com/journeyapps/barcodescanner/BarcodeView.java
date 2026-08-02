package com.journeyapps.barcodescanner;

import N9.o;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import h9.s;
import java.util.HashMap;
import java.util.List;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
public class BarcodeView extends c {

    /* renamed from: A, reason: collision with root package name */
    private b f60243A;

    /* renamed from: B, reason: collision with root package name */
    private N9.a f60244B;

    /* renamed from: C, reason: collision with root package name */
    private h f60245C;

    /* renamed from: D, reason: collision with root package name */
    private N9.h f60246D;

    /* renamed from: E, reason: collision with root package name */
    private Handler f60247E;

    final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i11 = message.what;
            BarcodeView barcodeView = BarcodeView.this;
            if (i11 == R.id.zxing_decode_succeeded) {
                com.journeyapps.barcodescanner.a aVar = (com.journeyapps.barcodescanner.a) message.obj;
                if (aVar != null && barcodeView.f60244B != null && barcodeView.f60243A != b.NONE) {
                    ((DecoratedBarcodeView.a) barcodeView.f60244B).barcodeResult(aVar);
                    if (barcodeView.f60243A == b.SINGLE) {
                        barcodeView.E();
                        return true;
                    }
                }
            } else if (i11 != R.id.zxing_decode_failed) {
                if (i11 != R.id.zxing_possible_result_points) {
                    return false;
                }
                List<s> list = (List) message.obj;
                if (barcodeView.f60244B != null && barcodeView.f60243A != b.NONE) {
                    ((DecoratedBarcodeView.a) barcodeView.f60244B).possibleResultPoints(list);
                }
            }
            return true;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b CONTINUOUS;
        public static final b NONE;
        public static final b SINGLE;

        static {
            b bVar = new b("NONE", 0);
            NONE = bVar;
            b bVar2 = new b("SINGLE", 1);
            SINGLE = bVar2;
            b bVar3 = new b("CONTINUOUS", 2);
            CONTINUOUS = bVar3;
            $VALUES = new b[]{bVar, bVar2, bVar3};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60243A = b.NONE;
        this.f60244B = null;
        a aVar = new a();
        this.f60246D = new N9.h();
        this.f60247E = new Handler(aVar);
    }

    private N9.f A() {
        if (this.f60246D == null) {
            this.f60246D = new N9.h();
        }
        N9.g gVar = new N9.g();
        HashMap hashMap = new HashMap();
        hashMap.put(h9.e.NEED_RESULT_POINT_CALLBACK, gVar);
        N9.f a11 = this.f60246D.a(hashMap);
        gVar.b(a11);
        return a11;
    }

    private void D() {
        h hVar = this.f60245C;
        if (hVar != null) {
            hVar.i();
            this.f60245C = null;
        }
        if (this.f60243A == b.NONE || !p()) {
            return;
        }
        h hVar2 = new h(i(), A(), this.f60247E);
        this.f60245C = hVar2;
        hVar2.f(k());
        this.f60245C.h();
    }

    public final void B(N9.a aVar) {
        this.f60243A = b.SINGLE;
        this.f60244B = aVar;
        D();
    }

    public final void C(N9.h hVar) {
        o.d();
        this.f60246D = hVar;
        h hVar2 = this.f60245C;
        if (hVar2 != null) {
            hVar2.g(A());
        }
    }

    public final void E() {
        this.f60243A = b.NONE;
        this.f60244B = null;
        h hVar = this.f60245C;
        if (hVar != null) {
            hVar.i();
            this.f60245C = null;
        }
    }

    @Override // com.journeyapps.barcodescanner.c
    public final void q() {
        h hVar = this.f60245C;
        if (hVar != null) {
            hVar.i();
            this.f60245C = null;
        }
        super.q();
    }

    @Override // com.journeyapps.barcodescanner.c
    protected final void s() {
        D();
    }
}
