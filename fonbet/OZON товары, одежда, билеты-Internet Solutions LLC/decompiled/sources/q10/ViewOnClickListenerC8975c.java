package q10;

import D00.g;
import android.view.View;
import q10.C8976d;
import ru.ozon.android.messenger.blocks.originalText.f;
import ru.ozon.app.android.messenger.databinding.MBlockOriginalTextBinding;

/* renamed from: q10.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC8975c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f81386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f81387c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f81388d;

    public /* synthetic */ ViewOnClickListenerC8975c(Object obj, Object obj2, Object obj3, int i11) {
        this.f81385a = i11;
        this.f81386b = obj;
        this.f81387c = obj2;
        this.f81388d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f81385a) {
            case 0:
                C8976d c8976d = (C8976d) this.f81386b;
                C8976d.a.e((g.b) this.f81388d, (C8976d.a) this.f81387c, c8976d);
                break;
            default:
                ru.ozon.android.messenger.blocks.originalText.c.d((ru.ozon.android.messenger.blocks.originalText.c) this.f81386b, (MBlockOriginalTextBinding) this.f81387c, (f) this.f81388d);
                break;
        }
    }
}
