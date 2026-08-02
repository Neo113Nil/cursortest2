package com.vk.movika.tools.controls.seekbar;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import com.vk.im.engine.di.executor.ImCmdCoroutinesExecutorComponentImpl;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.user.PostingSettingsUserView;
import com.vk.preview.di.GalleryPickerPreviewComponentImpl;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.TrackingElement;
import com.vk.video.ui.upload.impl.attachedclips.presentation.fragment.AttachedClipsFragmentInternalComponent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.Regex;
import xsna.a0f;
import xsna.a1w;
import xsna.b6m;
import xsna.c64;
import xsna.d6q0;
import xsna.e43;
import xsna.fxc0;
import xsna.fzv;
import xsna.gwh0;
import xsna.gzs;
import xsna.h5s;
import xsna.he0;
import xsna.kc10;
import xsna.kpp;
import xsna.nq4;
import xsna.ny1;
import xsna.opp;
import xsna.oq4;
import xsna.p4r;
import xsna.p6a0;
import xsna.pla;
import xsna.q1w;
import xsna.qcy;
import xsna.rq4;
import xsna.s3q0;
import xsna.u8r;
import xsna.wil;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ n(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = 0;
        switch (this.b) {
            case 0:
                DefaultSeekBarView.a aVar = DefaultSeekBarView.Companion;
                return new Integer[]{2, 0, 1, 0, 3};
            case 1:
                Context context = e43.a;
                return b6m.b(context != null ? context : null);
            case 2:
                Context context2 = e43.a;
                return (context2 != null ? context2 : null).getContentResolver();
            case 3:
                return new Handler(h5s.a("FrescoAnimationWorker").getLooper());
            case 4:
                AttachedClipsFragmentInternalComponent.a aVar2 = AttachedClipsFragmentInternalComponent.e;
                return c64.b;
            case 5:
                if (rq4.i && !rq4.f) {
                    rq4.a.i(rq4.e + 1);
                    Handler handler = rq4.g;
                    n nVar = rq4.h;
                    handler.removeCallbacks(new nq4(nVar, i));
                    handler.postDelayed(new oq4(0, nVar), 1000L);
                }
                return s3q0.a;
            case 6:
                return new he0();
            case 7:
                return new CopyOnWriteArrayList();
            case 8:
                return Boolean.valueOf(fxc0.B().J().Y0());
            case 9:
                return s3q0.a;
            case 10:
                return s3q0.a;
            case 11:
                return new Regex("/clips/music/([-0-9]+)_([0-9]+)");
            case 12:
                return new io.reactivex.rxjava3.disposables.g();
            case 13:
                return new a0f();
            case 14:
                return s3q0.a;
            case 15:
                return new kc10();
            case 16:
                d6q0.a.getClass();
                Iterator<ny1> it = d6q0.d.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                wil.a.getClass();
                wil.a();
                return s3q0.a;
            case 17:
                return new p4r();
            case 18:
                return s3q0.a;
            case 19:
                kpp kppVar = opp.T;
                TrackingElement.Registration registration = TrackingElement.Registration.LAST_NAME;
                RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
                return new com.vk.registration.funnels.d(registration);
            case 20:
                return new u8r.b((Looper) u8r.l.getValue());
            case 21:
                qcy<Object>[] qcyVarArr = GalleryPickerPreviewComponentImpl.e;
                return new p6a0();
            case 22:
                qcy<Object>[] qcyVarArr2 = ImCmdCoroutinesExecutorComponentImpl.b;
                a1w a1wVar = q1w.a;
                return new fzv(a1wVar != null ? a1wVar : null);
            case 23:
                return s3q0.a;
            case 24:
                return s3q0.a;
            case 25:
                return s3q0.a;
            case 26:
                return Boolean.valueOf(com.vk.toggle.d.M());
            case 27:
                int i2 = PostingSettingsUserView.A;
                return pla.e().b();
            case 28:
                return new gwh0(null);
            default:
                return new Location("NO_LOCATION");
        }
    }
}
