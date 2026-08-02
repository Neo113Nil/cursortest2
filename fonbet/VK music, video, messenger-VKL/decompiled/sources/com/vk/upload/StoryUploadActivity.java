package com.vk.upload;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.log.L;
import com.vk.media.entities.CameraPhotoParameters;
import com.vk.stat.scheme.SchemeStat$TypeShareItem;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.story.api.media.StoryMediaData;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import xsna.a1w;
import xsna.b4h;
import xsna.c5g;
import xsna.cvk;
import xsna.dhr0;
import xsna.fkq0;
import xsna.fpf0;
import xsna.g1m0;
import xsna.gl0;
import xsna.i0m0;
import xsna.i2w;
import xsna.j0m0;
import xsna.kbj0;
import xsna.kr5;
import xsna.m0q0;
import xsna.m7m;
import xsna.mhy;
import xsna.mll0;
import xsna.mnh0;
import xsna.nr4;
import xsna.o25;
import xsna.os9;
import xsna.p90;
import xsna.rdi;
import xsna.rok;
import xsna.s3q0;
import xsna.sok;
import xsna.t6g0;
import xsna.tb5;
import xsna.tok;
import xsna.uvl0;

/* compiled from: StoryUploadActivity.kt */
/* loaded from: classes6.dex */
public final class StoryUploadActivity extends VKActivity implements rok, m0q0 {
    public static final /* synthetic */ int x = 0;
    public final sok v = new sok(this);
    public j0m0 w;

    @Override // xsna.rok
    public final tok R() {
        return this.v;
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        j0m0 j0m0Var = this.w;
        if (j0m0Var == null) {
            j0m0Var = null;
        }
        j0m0Var.b(true);
        super.onBackPressed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0139, code lost:
    
        if (r1 > 1) goto L31;
     */
    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        Integer num;
        ArrayList arrayList;
        a1w a1wVar;
        List<Integer> list;
        List<StoryMediaData> list2;
        setTheme(dhr0.L() ? R.style.StoryViewActivityThemeMilk : R.style.StoryViewActivityThemeMilkDark);
        super.onCreate(bundle);
        mhy.f(getWindow());
        int c = dhr0.t.c(R.attr.vk_ui_background_modal);
        mnh0.x(this);
        p90.b(this, c, false);
        dhr0.r0(this);
        this.r = false;
        setContentView(new FrameLayout(this));
        uvl0 eb = ((StoriesComponent) m7m.a(this).a(fpf0.a(StoriesComponent.class))).eb();
        b4h b4hVar = new b4h(2, this, StoryUploadActivity.class, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "close(ZLandroid/content/Intent;)V", 0);
        j0m0 j0m0Var = new j0m0(eb, b4hVar);
        this.w = j0m0Var;
        Intent intent = getIntent();
        j0m0Var.e = intent;
        j0m0Var.g = (StoryMultiData) intent.getParcelableExtra("story");
        j0m0Var.h = (CameraPhotoParameters) intent.getParcelableExtra("camera_photo");
        j0m0Var.m = intent.getBooleanExtra("show_sending_message", false);
        j0m0Var.j = intent.getBooleanExtra("only_user", false);
        StoryMultiData storyMultiData = j0m0Var.g;
        if (storyMultiData != null) {
            CommonUploadParams commonUploadParams = storyMultiData.d;
            j0m0Var.f = commonUploadParams;
            if (fkq0.c(commonUploadParams.e)) {
                j0m0Var.i = fkq0.e(j0m0Var.f.e);
            }
        }
        intent.getStringExtra("description_text");
        int i = 1;
        j0m0Var.l = !intent.getBooleanExtra("target_me", false);
        if (fkq0.b(j0m0Var.i)) {
            t6g0 t6g0Var = t6g0.b;
            Group C0 = t6g0.b().C0(fkq0.e(j0m0Var.i));
            if (C0 != null) {
                UserId userId = C0.c;
                kr5.a aVar = new kr5.a(new os9(C0, i));
                aVar.b = C0.e;
                s3q0 s3q0Var = s3q0.a;
                j0m0Var.n = new tb5(userId, aVar.a(), C0.d, C0.Y, C0.n(), C0.a0);
            }
        } else if (j0m0Var.j) {
            j0m0Var.i = o25.a().c();
        }
        j0m0Var.d = new i0m0(i2w.a(), new mll0(j0m0Var, i));
        if (intent.getBooleanExtra("instant", false)) {
            if (j0m0Var.f != null) {
                StoryMultiData storyMultiData2 = j0m0Var.g;
                if (storyMultiData2 != null && (list2 = storyMultiData2.b) != null) {
                    int size = list2.size();
                    num = Integer.valueOf(size);
                }
                num = null;
                boolean z = j0m0Var.l;
                LinkedHashSet<g1m0> linkedHashSet = j0m0Var.k;
                if (!z || j0m0Var.f == null) {
                    CommonUploadParams commonUploadParams2 = j0m0Var.f;
                    if (!(commonUploadParams2 != null ? commonUploadParams2.Mb() : false) && (fkq0.c(j0m0Var.n.a) || linkedHashSet.isEmpty())) {
                        i = 0;
                    }
                }
                if (num != null) {
                    i = 0;
                }
                if (i != 0) {
                    if (fkq0.c(j0m0Var.n.a)) {
                        arrayList = new ArrayList();
                    } else {
                        arrayList = new ArrayList(linkedHashSet.size());
                        arrayList.addAll(linkedHashSet);
                    }
                    CommonUploadParams commonUploadParams3 = j0m0Var.f;
                    commonUploadParams3.c = j0m0Var.l;
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((g1m0) it.next()).getClass();
                        arrayList2.add(0L);
                    }
                    commonUploadParams3.d = arrayList2;
                    if (!fkq0.c(j0m0Var.f.e)) {
                        j0m0Var.f.e = j0m0Var.n.a;
                    }
                    CommonUploadParams commonUploadParams4 = j0m0Var.f;
                    if (commonUploadParams4 != null) {
                        if (fkq0.c(j0m0Var.n.a)) {
                            Collection<Narrative> collection = j0m0Var.o.get(fkq0.c(j0m0Var.n.a) ? fkq0.e(j0m0Var.n.a) : o25.a().c());
                            if (collection != null) {
                                Collection<Narrative> collection2 = collection;
                                ArrayList arrayList3 = new ArrayList(c5g.u(collection2, 10));
                                Iterator<T> it2 = collection2.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(Integer.valueOf(((Narrative) it2.next()).b));
                                }
                                list = rdi.x(arrayList3);
                                commonUploadParams4.p = list;
                            }
                        }
                        list = null;
                        commonUploadParams4.p = list;
                    }
                    j0m0Var.b(false);
                    StoryMultiData storyMultiData3 = j0m0Var.g;
                    if (storyMultiData3 != null) {
                        int b = j0m0Var.b.b(storyMultiData3);
                        Intent intent2 = j0m0Var.e;
                        if (intent2 != null) {
                            int intExtra = intent2.getIntExtra("request_sharing_success_code", -1);
                            Integer valueOf = intExtra != -1 ? Integer.valueOf(intExtra) : null;
                            if (valueOf != null) {
                                nr4.b().d(new kbj0.a(valueOf.intValue(), SchemeStat$TypeShareItem.ShareType.STORY, Long.valueOf(b), null, null, 56));
                            }
                        }
                        if (!linkedHashSet.isEmpty() && !fkq0.c(j0m0Var.n.a)) {
                            ArrayList arrayList4 = new ArrayList(c5g.u(linkedHashSet, 10));
                            for (g1m0 g1m0Var : linkedHashSet) {
                                Serializer.c<Peer> cVar = Peer.CREATOR;
                                g1m0Var.getClass();
                                arrayList4.add(Peer.a.b(0L));
                            }
                            i0m0 i0m0Var = j0m0Var.d;
                            if (i0m0Var != null && (a1wVar = i0m0Var.a) != null) {
                                a1wVar.D(j0m0Var, new gl0(arrayList4));
                            }
                        }
                        if (j0m0Var.m) {
                            cvk.u(R.string.story_is_sending, false);
                        }
                        L.e("StoryChoosePresenter", "finish upload activity, send story");
                        j0m0Var.c.invoke(Boolean.TRUE, new Intent().putExtra("task_id", b));
                        return;
                    }
                    return;
                }
            }
            b4hVar.invoke(Boolean.FALSE, null);
        }
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        j0m0 j0m0Var = this.w;
        if (j0m0Var == null) {
            j0m0Var = null;
        }
        j0m0Var.getClass();
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        j0m0 j0m0Var = this.w;
        if (j0m0Var == null) {
            j0m0Var = null;
        }
        j0m0Var.getClass();
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
