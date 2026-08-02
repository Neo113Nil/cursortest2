package gE;

import Jb0.h;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import ld0.C7934c;
import ru.ozon.android.messenger.framework.navigation.action.b;
import ru.ozon.android.messenger.framework.presentation.common.screen.j;
import ru.ozon.android.messenger.framework.presentation.models.k;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.video.GalleryV5VideoVH;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* renamed from: gE.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class ViewOnClickListenerC6686a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f64149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f64150c;

    public /* synthetic */ ViewOnClickListenerC6686a(int i11, Object obj, Object obj2) {
        this.f64148a = i11;
        this.f64149b = obj;
        this.f64150c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f64150c;
        Object obj2 = this.f64149b;
        switch (this.f64148a) {
            case 0:
                GalleryV5VideoVH.bind$lambda$4((GalleryV5VO.Item.Video) obj2, (GalleryV5VideoVH) obj, view);
                return;
            case 1:
                C7934c.t((C7934c) obj2, (h) obj);
                return;
            default:
                int i11 = j.f91127e;
                AtomActionDTO a11 = ((k.b) obj2).a();
                j jVar = (j) obj;
                if (a11 != null) {
                    ru.ozon.android.messenger.framework.navigation.controller.a aVar = jVar.f91128a;
                    if (aVar == null) {
                        Intrinsics.n("controller");
                        throw null;
                    }
                    aVar.q(b.c(a11));
                }
                jVar.dismiss();
                return;
        }
    }
}
