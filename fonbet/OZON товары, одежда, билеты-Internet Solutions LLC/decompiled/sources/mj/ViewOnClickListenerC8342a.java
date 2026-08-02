package mj;

import android.view.View;
import kotlin.jvm.functions.Function0;
import ru.ozon.android.inAppUpdate.internal.ui.d;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

/* renamed from: mj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC8342a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f76000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f76001c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f76002d;

    public /* synthetic */ ViewOnClickListenerC8342a(Object obj, Object obj2, Object obj3, int i11) {
        this.f75999a = i11;
        this.f76000b = obj;
        this.f76001c = obj2;
        this.f76002d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f75999a) {
            case 0:
                d.a((d) this.f76000b, (ButtonView) this.f76001c, (Function0) this.f76002d);
                break;
            default:
                ru.ozon.android.messenger.blocks.productshelf.b.c((ru.ozon.android.messenger.blocks.productshelf.b) this.f76000b, (BadgeDTO) this.f76001c, (AtomActionDTO) this.f76002d);
                break;
        }
    }
}
