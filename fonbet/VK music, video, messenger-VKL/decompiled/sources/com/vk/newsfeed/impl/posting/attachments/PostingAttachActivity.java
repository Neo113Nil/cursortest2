package com.vk.newsfeed.impl.posting.attachments;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.f;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.base.metrics.AttachPickerTechMetricsSession;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.impl.support.ParentSupportFragment;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.posting.attachments.AttachType;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachActivity;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachLocationFragment;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import com.vkontakte.android.TabletDialogActivity;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bpn0;
import xsna.c3r0;
import xsna.c44;
import xsna.dhr0;
import xsna.e3m;
import xsna.fkl;
import xsna.fnj;
import xsna.glc0;
import xsna.h7u0;
import xsna.hd60;
import xsna.iah0;
import xsna.j34;
import xsna.m0q0;
import xsna.mhy;
import xsna.rfc0;
import xsna.tal;
import xsna.tnf;
import xsna.tun;
import xsna.tvo;
import xsna.vbc0;
import xsna.wp40;
import xsna.xbc0;
import xsna.ye80;

/* compiled from: PostingAttachActivity.kt */
/* loaded from: classes4.dex */
public final class PostingAttachActivity extends TabletDialogActivity implements j34, m0q0 {
    public static final /* synthetic */ int X = 0;
    public int N;
    public CoordinatorLayout O;
    public FrameLayout P;
    public VkBottomSheetBehavior<FrameLayout> Q;
    public FragmentImpl R;
    public boolean S;
    public int T;
    public AttachType M = AttachType.PHOTO;
    public final bpn0 U = new bpn0(new wp40(this, 15));
    public final bpn0 V = new bpn0(new ye80(this, 6));
    public final b W = new b();

    /* compiled from: PostingAttachActivity.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttachType.values().length];
            try {
                iArr[AttachType.TAKE_PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachType.PHOTO_VK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AttachType.PHOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AttachType.MUSIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AttachType.VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AttachType.DOCUMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AttachType.PLACE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AttachType.GOOD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AttachType.SERVICE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AttachType.POLL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AttachType.ARTICLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AttachType.ALBUM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PostingAttachActivity.kt */
    public static final class b extends VkBottomSheetBehavior.a {
        public b() {
        }

        @Override // com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior.a
        public final void i(View view, float f) {
            float f2 = -Math.max(-1.0f, Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f - 1.0f));
            PostingAttachActivity postingAttachActivity = PostingAttachActivity.this;
            int b = c3r0.b(f2, postingAttachActivity.N, 0);
            CoordinatorLayout coordinatorLayout = postingAttachActivity.O;
            if (coordinatorLayout != null) {
                coordinatorLayout.setBackgroundColor(b);
            }
        }

        @Override // com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior.a
        public final void j(int i, View view) {
            final PostingAttachActivity postingAttachActivity = PostingAttachActivity.this;
            if (i == 4 || i == 5) {
                f fVar = (FragmentImpl) ((ParentSupportFragment) postingAttachActivity.n().a.H("fragment_default_tag"));
                if (!postingAttachActivity.S) {
                    HashSet hashSet = iah0.a;
                    if (!fnj.d(postingAttachActivity) && (fVar instanceof glc0)) {
                        final glc0 glc0Var = (glc0) fVar;
                        if (glc0Var.Xe()) {
                            h7u0.a aVar = new h7u0.a(postingAttachActivity);
                            aVar.g0(R.string.confirm);
                            aVar.U(R.string.poll_deleted_warning);
                            aVar.c0(R.string.delete, new vbc0(postingAttachActivity, 0));
                            aVar.W(R.string.cancel, new DialogInterface.OnClickListener() { // from class: xsna.wbc0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    PostingAttachActivity postingAttachActivity2 = PostingAttachActivity.this;
                                    postingAttachActivity2.S = false;
                                    VkBottomSheetBehavior<FrameLayout> vkBottomSheetBehavior = postingAttachActivity2.Q;
                                    if (vkBottomSheetBehavior != null) {
                                        vkBottomSheetBehavior.J(3);
                                    }
                                    glc0Var.Gi();
                                }
                            });
                            aVar.c = true;
                            aVar.a.n = new xbc0(postingAttachActivity, 0);
                            aVar.m();
                            mhy.b(postingAttachActivity);
                        }
                    }
                }
                postingAttachActivity.Y1();
            }
            hd60.a().X(i, postingAttachActivity.R);
        }
    }

    public static void Z1(Intent intent, Intent intent2, fkl fklVar, Long l) {
        tal talVar = new tal();
        if (intent.hasExtra("attachPickerTechMetrics")) {
            AttachPickerTechMetricsSession attachPickerTechMetricsSession = (AttachPickerTechMetricsSession) intent.getParcelableExtra("attachPickerTechMetrics");
            if (attachPickerTechMetricsSession != null) {
                talVar.c = attachPickerTechMetricsSession.b;
                talVar.d = attachPickerTechMetricsSession.c;
            }
            Long l2 = talVar.d;
            if (l2 != null) {
                l = l2;
            }
            fklVar.b = l;
            fklVar.a = talVar.c;
            fklVar.c(intent2);
        }
    }

    @Override // com.vkontakte.android.TabletDialogActivity, com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity
    public final void O1(Configuration configuration) {
        VkBottomSheetBehavior<FrameLayout> vkBottomSheetBehavior;
        super.O1(configuration);
        if (this.T == configuration.orientation || (vkBottomSheetBehavior = this.Q) == null || vkBottomSheetBehavior.i != 1) {
            return;
        }
        finish();
        this.T = configuration.orientation;
    }

    @Override // xsna.j34
    public final void V2(Intent intent) {
        if (intent != null) {
            Z1(intent, intent, new fkl(), null);
        }
        setResult(-1, intent);
        finish();
    }

    public final void Y1() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, android.app.Activity
    public final void finish() {
        FragmentImpl m;
        Intent intent = getIntent();
        if (intent != null) {
            fkl fklVar = new fkl();
            com.vk.core.fragments.a aVar = n().h;
            Intent intent2 = (aVar == null || (m = aVar.m()) == null) ? null : m.B;
            if (intent2 != null && !intent2.hasExtra("PICKER_TECH_METRICS_SESSION")) {
                Z1(intent, intent2, fklVar, Long.valueOf(SystemClock.elapsedRealtime()));
            }
        }
        HashSet hashSet = iah0.a;
        if (fnj.d(this)) {
            Y1();
            return;
        }
        this.S = true;
        VkBottomSheetBehavior<FrameLayout> vkBottomSheetBehavior = this.Q;
        if (vkBottomSheetBehavior != null) {
            vkBottomSheetBehavior.J(5);
        }
        VkBottomSheetBehavior<FrameLayout> vkBottomSheetBehavior2 = this.Q;
        if (vkBottomSheetBehavior2 == null || vkBottomSheetBehavior2.i != 5) {
            return;
        }
        Y1();
    }

    @Override // com.vkontakte.android.TabletDialogActivity, com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        FragmentImpl fragmentImpl;
        super.onActivityResult(i, i2, intent);
        if (i != 10666 || (fragmentImpl = this.R) == null) {
            return;
        }
        fragmentImpl.onActivityResult(i, i2, intent);
    }

    @Override // com.vkontakte.android.TabletDialogActivity, com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        HashSet hashSet = iah0.a;
        if (fnj.d(this)) {
            TabletDialogActivity.a aVar = new TabletDialogActivity.a(0);
            rfc0.c(aVar, this);
            Bundle bundle2 = aVar.b;
            bundle2.putInt("input_mode", 32);
            bundle2.putInt("window_background_resource", android.R.color.transparent);
            getIntent().putExtras(bundle2);
        } else {
            if (dhr0.L()) {
                setTheme(R.style.AttachTransparentTheme);
            } else {
                setTheme(R.style.AttachTransparentDarkTheme);
            }
            overridePendingTransition(R.anim.activity_posting_slide_in, R.anim.activity_posting_slide_out);
        }
        mhy.h(this);
        super.onCreate(bundle);
        getWindow().setStatusBarColor(0);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        e3m.a aVar2 = e3m.a;
        this.N = getColor(R.color.picker_semi_transparent_background);
        this.T = getResources().getConfiguration().orientation;
        this.r = false;
        dhr0.r0(this);
        LayoutInflater.from(this).inflate(R.layout.activity_posting_attachments, (ViewGroup) this.K, true);
        this.K.setStatusBarBackgroundColor(0);
        this.O = (CoordinatorLayout) findViewById(R.id.posting_attachments_root_layout);
        this.P = (FrameLayout) findViewById(R.id.posting_attachments_bottom_layout);
        FragmentImpl fragmentImpl = null;
        if (!fnj.d(this)) {
            FrameLayout frameLayout = this.P;
            ((CoordinatorLayout.f) (frameLayout != null ? frameLayout.getLayoutParams() : null)).c(new VkBottomSheetBehavior());
            VkBottomSheetBehavior<FrameLayout> F = VkBottomSheetBehavior.F(this.P);
            if (F != null) {
                F.q = this.W;
                F.h = true;
                F.J(3);
            } else {
                F = null;
            }
            this.Q = F;
        }
        Bundle extras = getIntent().getExtras();
        Object obj = extras != null ? extras.get("type") : null;
        AttachType attachType = obj instanceof AttachType ? (AttachType) obj : null;
        if (attachType != null) {
            this.M = attachType;
        }
        int intExtra = getIntent().getIntExtra("currAtt", 0);
        int intExtra2 = getIntent().getIntExtra("maxAtt", 10);
        switch (a.$EnumSwitchMapping$0[this.M.ordinal()]) {
            case 1:
            case 2:
            case 3:
                fragmentImpl = hd60.a().f1(intExtra, intExtra2, getIntent().getBooleanExtra("takePhoto", false));
                break;
            case 4:
                fragmentImpl = hd60.a().I(intExtra2 - intExtra, intExtra2);
                break;
            case 5:
                fragmentImpl = ((c44) this.V.getValue()).a(intExtra2 - intExtra, intExtra2);
                break;
            case 6:
                fragmentImpl = ((tun) this.U.getValue()).b(null, intExtra2 - intExtra, intExtra2, true, true, true, (r11 & 64) == 0);
                break;
            case 7:
                PostingAttachLocationFragment.b bVar = new PostingAttachLocationFragment.b(PostingAttachLocationFragment.class, null, null);
                bVar.j.putBoolean("shouldMeasureTechStats", true);
                fragmentImpl = bVar.f();
                break;
            case 8:
            case 9:
            case 11:
            case 12:
                break;
            case 10:
                if (getIntent().hasExtra("pollEdit")) {
                    PollAttachment pollAttachment = (PollAttachment) getIntent().getParcelableExtra("pollEdit");
                    int i = PollEditorFragment.a.m;
                    PollEditorFragment.a b2 = PollEditorFragment.a.C1520a.b(pollAttachment, "wall");
                    b2.j.putBoolean("shouldMeasureTechMetrics", true);
                    fragmentImpl = b2.f();
                    break;
                } else {
                    if (!getIntent().hasExtra("ownerId")) {
                        throw new IllegalArgumentException("Can't create poll create/edit without ownerId or attachment");
                    }
                    int i2 = PollEditorFragment.a.m;
                    UserId userId = (UserId) getIntent().getParcelableExtra("ownerId");
                    if (userId == null) {
                        userId = UserId.d;
                    }
                    PollEditorFragment.a a2 = PollEditorFragment.a.C1520a.a(userId, "wall");
                    Bundle bundle3 = a2.j;
                    bundle3.putBoolean("shouldMeasureTechMetrics", true);
                    int intExtra3 = getIntent().getIntExtra("pollMaxTitleLength", 0);
                    if (intExtra3 != 0) {
                        bundle3.putInt("maxTitleLength", intExtra3);
                    }
                    fragmentImpl = a2.f();
                    break;
                }
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.R = fragmentImpl;
        n().q().a(R.id.posting_attachments_bottom_layout, this.R);
        FrameLayout frameLayout2 = this.P;
        if (frameLayout2 != null) {
            frameLayout2.postDelayed(new tnf(this, 8), 30L);
        }
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, xsna.tvo.a
    public final void pc(int i, List<String> list) {
        super.pc(i, list);
        f fVar = this.R;
        tvo.a aVar = fVar instanceof tvo.a ? (tvo.a) fVar : null;
        if (aVar != null) {
            aVar.pc(i, list);
        }
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, xsna.tvo.a
    public final void wi(int i, List<String> list) {
        super.wi(i, list);
        f fVar = this.R;
        tvo.a aVar = fVar instanceof tvo.a ? (tvo.a) fVar : null;
        if (aVar != null) {
            aVar.wi(i, list);
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        switch (a.$EnumSwitchMapping$0[this.M.ordinal()]) {
            case 1:
            case 2:
            case 3:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_PHOTO;
                break;
            case 4:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_MUSIC;
                break;
            case 5:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_VIDEO;
                break;
            case 6:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_DOCUMENT;
                break;
            case 7:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_PLACE;
                break;
            case 8:
            case 9:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_GOOD;
                break;
            case 10:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_POLL;
                break;
            case 11:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_ARTICLE;
                break;
            case 12:
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_ALBUM;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
    }
}
