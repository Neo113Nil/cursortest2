package com.vk.profile.user.impl.di;

import android.content.Context;
import com.vk.articleeditor.api.di.ArticleComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.di.component.DiUnscopedWithParamsComponent;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.profile.user.api.di.UserProfileParamsComponent;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.story.api.di.StoriesComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.at5;
import xsna.de60;
import xsna.e7m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.fzd0;
import xsna.gul0;
import xsna.hpf0;
import xsna.htq0;
import xsna.jo60;
import xsna.kld0;
import xsna.kud0;
import xsna.l36;
import xsna.l9i;
import xsna.lzd0;
import xsna.m7a0;
import xsna.nid0;
import xsna.nwy;
import xsna.q8m;
import xsna.qcy;
import xsna.qmq0;
import xsna.r0e0;
import xsna.t9w;
import xsna.tuq0;
import xsna.uv80;
import xsna.uvl0;
import xsna.vnq0;
import xsna.vvd0;
import xsna.wjs0;
import xsna.wvw;
import xsna.ysg0;

/* compiled from: UserProfileParamsComponentImpl.kt */
/* loaded from: classes5.dex */
public final class UserProfileParamsComponentImpl implements UserProfileParamsComponent {
    public static final /* synthetic */ qcy<Object>[] p;
    public final Context a;
    public final htq0 b;
    public final StoriesComponent c;
    public final BridgeComponent d;
    public final PhotosComponent e;
    public final NarrativeComponent f;
    public final UserProfileComponent g;
    public final ArticleComponent h;
    public final InfoBridgeComponent i;
    public final de60 j;
    public final nwy k = new nwy(new jo60(17));
    public final nwy l = new nwy(new uv80(11));
    public final nwy m = new nwy(new kld0(this, 18));
    public final nwy n = new nwy(new kud0(4));
    public final nwy o = new nwy(new nid0(this, 16));

    /* compiled from: UserProfileParamsComponentImpl.kt */
    public static final class a implements q8m<UserProfileParamsComponent, qmq0> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // xsna.q8m
        public final DiUnscopedWithParamsComponent a(e7m e7mVar, l9i l9iVar) {
            return new UserProfileParamsComponentImpl(this.a, ((qmq0) l9iVar).a, (StoriesComponent) e7mVar.a(fpf0.a(StoriesComponent.class)), (BridgeComponent) e7mVar.a(fpf0.a(BridgeComponent.class)), (PhotosComponent) e7mVar.a(fpf0.a(PhotosComponent.class)), (NarrativeComponent) e7mVar.a(fpf0.a(NarrativeComponent.class)), (UserProfileComponent) e7mVar.b(fpf0.a(UserProfileComponent.class)), (ArticleComponent) e7mVar.b(fpf0.a(ArticleComponent.class)), (InfoBridgeComponent) e7mVar.a(fpf0.a(InfoBridgeComponent.class)), ((NewsFeedComponent) e7mVar.a(fpf0.a(NewsFeedComponent.class))).Bb());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(UserProfileParamsComponentImpl.class, "profileUserIdHolder", "getProfileUserIdHolder()Lcom/vk/profile/user/impl/data/ProfileUserIdHolderImpl;", 0);
        hpf0 hpf0Var = fpf0.a;
        p = new qcy[]{propertyReference1Impl, fp.c(0, UserProfileParamsComponentImpl.class, "extendedProfileRepository", "getExtendedProfileRepository()Lcom/vk/repository/data/api/ExtendedProfilesRepository;", hpf0Var), ep.a(0, UserProfileParamsComponentImpl.class, "profilePhotoUploadInteractor", "getProfilePhotoUploadInteractor()Lcom/vk/profile/user/api/domain/ProfilePhotoUploadInteractor;", hpf0Var), ep.a(0, UserProfileParamsComponentImpl.class, "profileServices", "getProfileServices()Lcom/vk/profile/user/impl/data/ProfileServices;", hpf0Var), ep.a(0, UserProfileParamsComponentImpl.class, "profileDetailsDialogProvider", "getProfileDetailsDialogProvider()Lcom/vk/profile/user/impl/details/ProfileDetailsDialogProviderImpl;", hpf0Var)};
    }

    public UserProfileParamsComponentImpl(Context context, htq0 htq0Var, StoriesComponent storiesComponent, BridgeComponent bridgeComponent, PhotosComponent photosComponent, NarrativeComponent narrativeComponent, UserProfileComponent userProfileComponent, ArticleComponent articleComponent, InfoBridgeComponent infoBridgeComponent, de60 de60Var) {
        this.a = context;
        this.b = htq0Var;
        this.c = storiesComponent;
        this.d = bridgeComponent;
        this.e = photosComponent;
        this.f = narrativeComponent;
        this.g = userProfileComponent;
        this.h = articleComponent;
        this.i = infoBridgeComponent;
        this.j = de60Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r0e0 Df() {
        qcy<Object> qcyVar = p[0];
        return (r0e0) this.k.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.user.api.di.UserProfileParamsComponent
    public final vvd0 K7() {
        qcy<Object> qcyVar = p[4];
        return (vvd0) this.o.c();
    }

    @Override // com.vk.profile.user.api.di.UserProfileParamsComponent
    public final fzd0 P3() {
        qcy<Object> qcyVar = p[2];
        return (fzd0) this.m.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.user.api.di.UserProfileParamsComponent
    public final l36 Pd() {
        wvw t = this.d.t();
        qcy<Object> qcyVar = p[3];
        return new l36(t, (lzd0) this.n.c());
    }

    @Override // com.vk.profile.user.api.di.UserProfileParamsComponent
    public final vnq0 Y8() {
        r0e0 Df = Df();
        wjs0 wjs0Var = wjs0.a;
        qcy<Object> qcyVar = p[1];
        ExtendedProfilesRepository extendedProfilesRepository = (ExtendedProfilesRepository) this.l.c();
        PhotosComponent photosComponent = this.e;
        return new vnq0(Df, wjs0Var, extendedProfilesRepository, photosComponent.i3(), photosComponent.r1(), this.f.c6(), photosComponent.p7().a(), this.h.d0());
    }

    @Override // com.vk.profile.user.api.di.UserProfileParamsComponent
    public final r0e0 aa() {
        return Df();
    }

    @Override // com.vk.profile.user.api.di.UserProfileParamsComponent
    public final r0e0 pf() {
        return Df();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.profile.user.api.di.UserProfileParamsComponent
    public final tuq0 xd() {
        r0e0 Df = Df();
        qcy<Object>[] qcyVarArr = p;
        qcy<Object> qcyVar = qcyVarArr[1];
        ExtendedProfilesRepository extendedProfilesRepository = (ExtendedProfilesRepository) this.l.c();
        StoriesComponent storiesComponent = this.c;
        uvl0 eb = storiesComponent.eb();
        gul0 b7 = storiesComponent.b7();
        at5 at5Var = at5.b;
        qcy<Object> qcyVar2 = qcyVarArr[3];
        lzd0 lzd0Var = (lzd0) this.n.c();
        ysg0<m7a0> a2 = this.e.p7().a();
        UserProfileComponent userProfileComponent = this.g;
        return new tuq0(Df, this.a, this.b, extendedProfilesRepository, eb, b7, at5Var, lzd0Var, a2, userProfileComponent.D8().a(), this.i.t().b(), new t9w(this.j, 2), userProfileComponent.fa());
    }
}
