package dL;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* renamed from: dL.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6128a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f61419b;

    public /* synthetic */ ViewOnClickListenerC6128a(Function0 function0, int i11) {
        this.f61418a = i11;
        this.f61419b = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f61418a) {
            case 0:
                this.f61419b.invoke();
                break;
            default:
                this.f61419b.invoke();
                break;
        }
    }
}
