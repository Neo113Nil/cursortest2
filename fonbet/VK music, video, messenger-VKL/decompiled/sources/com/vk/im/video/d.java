package com.vk.im.video;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import com.vk.dto.attaches.Attach;
import com.vk.dto.user.RequestUserProfile;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.im.video.e;
import com.vk.newsfeed.common.recycler.holders.donut.DonutPostClickSource;
import com.vk.photo.editor.features.colorgrading.h;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.sharing.core.SharingActivity;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import one.video.controls20.SimpleControlsView;
import org.chromium.base.TimeUtils;
import xsna.abi0;
import xsna.b4o;
import xsna.bug0;
import xsna.bwt0;
import xsna.cew;
import xsna.cr30;
import xsna.cxs0;
import xsna.dhy0;
import xsna.dr30;
import xsna.epx;
import xsna.fh5;
import xsna.fss;
import xsna.fzy0;
import xsna.gzs;
import xsna.iio;
import xsna.ik7;
import xsna.j1o;
import xsna.k9q0;
import xsna.l50;
import xsna.mhy;
import xsna.mis;
import xsna.mqd;
import xsna.nf1;
import xsna.nk;
import xsna.o950;
import xsna.p4r;
import xsna.pbw;
import xsna.pk30;
import xsna.pvo0;
import xsna.q55;
import xsna.qfk0;
import xsna.r55;
import xsna.s2n0;
import xsna.s3q0;
import xsna.t1o;
import xsna.wio;
import xsna.yg5;
import xsna.yis;
import xsna.yx0;
import xsna.zxd0;
import xsna.zxv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        int i2 = 5;
        Object obj = this.c;
        switch (i) {
            case 0:
                e eVar = (e) obj;
                AttachVideoMsg attachVideoMsg = eVar.f;
                pbw pbwVar = eVar.d;
                if (attachVideoMsg == null || !attachVideoMsg.M()) {
                    abi0 abi0Var = eVar.M;
                    if (!epx.f(abi0Var != null ? Boolean.valueOf(abi0Var.b()) : eVar.I, Boolean.TRUE)) {
                        e.c cVar = eVar.H;
                        e.c cVar2 = e.c.ACTIVE;
                        if (cVar == cVar2) {
                            fh5 fh5Var = eVar.j;
                            if (fh5Var == null) {
                                fh5Var = null;
                            }
                            yg5 yg5Var = fh5Var.j;
                            if (yg5Var == null) {
                                yg5Var = null;
                            }
                            if (yg5Var.isPaused()) {
                                fh5 fh5Var2 = eVar.j;
                                if (fh5Var2 == null) {
                                    fh5Var2 = null;
                                }
                                fh5Var2.B0();
                                fh5 fh5Var3 = eVar.j;
                                if (fh5Var3 == null) {
                                    fh5Var3 = null;
                                }
                                fh5Var3.m0();
                                if (pbwVar != null) {
                                    cxs0 l = pbwVar.l();
                                    Msg msg = eVar.g;
                                    l.f(msg != null ? msg : null, eVar.f);
                                    break;
                                }
                            }
                        }
                        if (eVar.H != cVar2) {
                            ValueAnimator valueAnimator = eVar.K;
                            if (valueAnimator == null || !valueAnimator.isRunning()) {
                                eVar.j();
                                if (pbwVar != null) {
                                    cxs0 l2 = pbwVar.l();
                                    Msg msg2 = eVar.g;
                                    l2.f(msg2 != null ? msg2 : null, eVar.f);
                                }
                                s2n0 s2n0Var = eVar.N;
                                if (s2n0Var != null) {
                                    s2n0Var.b();
                                    break;
                                }
                            }
                        } else {
                            eVar.o(true);
                            if (pbwVar != null) {
                                cxs0 l3 = pbwVar.l();
                                Msg msg3 = eVar.g;
                                l3.k(msg3 != null ? msg3 : null, eVar.f);
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                BonusCatalogFragment bonusCatalogFragment = ((ik7) obj).l;
                bug0.d(bonusCatalogFragment.eo().a(null, null), bonusCatalogFragment.mo2getContext(), null, 6).subscribe(new nf1(new yx0(bonusCatalogFragment, 10), 8), new l50(new nk(i2), i2));
                break;
            case 2:
                ((com.vk.im.ui.components.chat_profile.a) obj).t(zxd0.b.a);
                break;
            case 3:
                mhy.j(((mqd) obj).A);
                break;
            case 4:
                t1o t1oVar = (t1o) obj;
                b4o b4oVar = (b4o) t1oVar.C;
                if (b4oVar != null) {
                    j1o.a(t1oVar, t1oVar.itemView.getContext(), b4oVar.i, (p4r) t1oVar.F.getValue(), DonutPostClickSource.Background);
                    break;
                }
                break;
            case 5:
                iio iioVar = ((wio) obj).e.c;
                (iioVar != null ? iioVar : null).a(k9q0.c);
                break;
            case 6:
                yis yisVar = (yis) obj;
                mis misVar = yisVar.z;
                RequestUserProfile requestUserProfile = (RequestUserProfile) yisVar.m;
                String str = yisVar.p;
                misVar.getClass();
                int a = pvo0.a();
                String str2 = "friend_recomm_visit:" + requestUserProfile.c + ':' + str + ':' + requestUserProfile.J;
                if (!com.vkontakte.android.data.b.i(str2)) {
                    String str3 = requestUserProfile.c + '|' + a + '|' + str + '|' + requestUserProfile.J;
                    b.d dVar = new b.d("open_user");
                    dVar.b = true;
                    dVar.c = true;
                    dVar.b(str3, "user_ids");
                    dVar.e();
                    com.vkontakte.android.data.b.e(TimeUtils.MILLISECONDS_PER_DAY, str2);
                }
                yisVar.n.a(new fss.b.d((RequestUserProfile) yisVar.m));
                break;
            case 7:
                ((ImSettingsDialogThemeFragment) obj).P.getClass();
                SharedPreferences.Editor edit = cew.h().edit();
                edit.putBoolean("cfg_is_theme_warning_dismissed", true);
                edit.apply();
                bwt0.p0(view, false);
                break;
            case 8:
                cr30 cr30Var = (cr30) obj;
                pk30 pk30Var = cr30Var.j;
                dr30 dr30Var = cr30Var.k;
                Msg msg4 = dr30Var != null ? dr30Var.m : null;
                NestedMsg nestedMsg = dr30Var != null ? dr30Var.n : null;
                Attach attach = dr30Var != null ? dr30Var.o : null;
                if (pk30Var != null && msg4 != null && nestedMsg != null && attach != null) {
                    pk30Var.O(attach);
                    break;
                }
                break;
            case 9:
                o950 o950Var = (o950) obj;
                if (!o950Var.r) {
                    o950Var.p.getClass();
                    q55.a(o950Var);
                    o950Var.r = true;
                    AppCompatActivity appCompatActivity = o950Var.n;
                    CharSequence text = appCompatActivity.getText(R.string.music_verify_phone_text);
                    o950Var.o.getClass();
                    com.vk.auth.validation.b.c(r55.d, appCompatActivity, o950Var.q, text);
                    break;
                } else {
                    CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior = o950Var.k;
                    if (customisableBottomSheetBehavior != null) {
                        customisableBottomSheetBehavior.J(5);
                        break;
                    }
                }
                break;
            case 10:
                int i3 = QuestionsListFragment.f0;
                ((QuestionsListFragment) obj).lo();
                break;
            case 11:
                Bundle bundle = SharingActivity.n0;
                ((SharingActivity) obj).w.t1(null);
                break;
            case 12:
                int i4 = SimpleControlsView.S;
                gzs<s3q0> techBugReportHandler = ((SimpleControlsView) obj).getTechBugReportHandler();
                if (techBugReportHandler != null) {
                    techBugReportHandler.invoke();
                    break;
                }
                break;
            case 13:
                ((qfk0) obj).b.play();
                break;
            case 14:
                ((h) obj).c(true);
                break;
            case 15:
                zxv0.a aVar = (zxv0.a) obj;
                WebUserShortInfo webUserShortInfo = aVar.q;
                if (webUserShortInfo != null) {
                    aVar.l.invoke(webUserShortInfo);
                }
                aVar.n.setChecked(!r8.isChecked());
                break;
            case 16:
                ((dhy0) obj).i.c(view, 1);
                break;
            default:
                ((fzy0) obj).g.k();
                break;
        }
    }
}
