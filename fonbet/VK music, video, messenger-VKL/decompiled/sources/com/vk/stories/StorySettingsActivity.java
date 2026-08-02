package com.vk.stories;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.button.Appearance;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.pushes.PushAwareActivity;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.b0;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.completable.i;
import io.reactivex.rxjava3.internal.operators.completable.p;
import io.reactivex.rxjava3.internal.operators.observable.l0;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import io.reactivex.rxjava3.internal.operators.single.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.a06;
import xsna.asu0;
import xsna.bpn0;
import xsna.bsl0;
import xsna.bwt0;
import xsna.bx80;
import xsna.cam0;
import xsna.da50;
import xsna.dam0;
import xsna.dhr0;
import xsna.dkj0;
import xsna.e3m;
import xsna.ei30;
import xsna.epx;
import xsna.evl0;
import xsna.f6m0;
import xsna.foh;
import xsna.gkc0;
import xsna.gko;
import xsna.gzs;
import xsna.hu50;
import xsna.iah0;
import xsna.ie40;
import xsna.ie90;
import xsna.io;
import xsna.izs;
import xsna.j5g;
import xsna.je40;
import xsna.jed0;
import xsna.jg4;
import xsna.k5j0;
import xsna.kb10;
import xsna.kz;
import xsna.l4k0;
import xsna.l7s;
import xsna.ldm0;
import xsna.m4k0;
import xsna.mcj0;
import xsna.med0;
import xsna.mnh0;
import xsna.msy;
import xsna.ned0;
import xsna.ni9;
import xsna.ns6;
import xsna.o3y;
import xsna.ox80;
import xsna.pmu;
import xsna.qg60;
import xsna.qzl0;
import xsna.r1r0;
import xsna.r870;
import xsna.rsg0;
import xsna.s0w0;
import xsna.s1r0;
import xsna.s3q0;
import xsna.t520;
import xsna.tlo0;
import xsna.tq;
import xsna.vv20;
import xsna.vw0;
import xsna.w2j0;
import xsna.whg0;
import xsna.x150;
import xsna.xj50;
import xsna.xka0;
import xsna.y01;
import xsna.yfb;
import xsna.z4d0;
import xsna.zva;
import xsna.zyl0;

/* compiled from: StorySettingsActivity.kt */
/* loaded from: classes6.dex */
public final class StorySettingsActivity extends PushAwareActivity {
    public static final /* synthetic */ int P = 0;
    public View A;
    public View B;
    public VkButton C;
    public LinearLayout D;
    public VkGroupHeader E;
    public VkCellButton F;
    public VkCell G;
    public VkCell H;
    public VkCell I;
    public VkCell J;
    public boolean K;
    public final HashMap L;
    public boolean M;
    public MobileOfficialAppsConStoriesStat$ViewEntryPoint N;
    public final io.reactivex.rxjava3.disposables.b O;
    public final dam0 v = new dam0();
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    /* compiled from: StorySettingsActivity.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: StorySettingsActivity.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public StorySettingsActivity() {
        vv20 vv20Var = new vv20(this, 28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.w = msy.a(lazyThreadSafetyMode, vv20Var);
        this.x = msy.a(lazyThreadSafetyMode, new w2j0(this, 4));
        this.y = msy.a(lazyThreadSafetyMode, new gkc0(this, 15));
        this.z = msy.a(lazyThreadSafetyMode, new da50(this, 25));
        this.L = new HashMap();
        this.O = new io.reactivex.rxjava3.disposables.b();
    }

    public static VkCell.Right.d T1(boolean z, gzs gzsVar) {
        return VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.f(4, gzsVar, z), null, null, null, 30);
    }

    @Override // com.vk.core.ui.themes.ThemableActivity, xsna.too0
    public final void Ng() {
        super.Ng();
        recreate();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void U1() {
        W1();
        this.O.b(new l0(rsg0.y0(new io(null, ((evl0) this.z.getValue()).f(), true, true), null, null, 3), new bx80(new zyl0(this, 3), 10)).g(new zva(this, 3)).i(new qg60(new xka0(this, 16), 15)).subscribe());
        Z1();
    }

    public final void V1() {
        View view = this.A;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
        View view2 = this.B;
        if (view2 == null) {
            view2 = null;
        }
        view2.setVisibility(8);
        VkButton vkButton = this.C;
        (vkButton != null ? vkButton : null).setVisibility(8);
    }

    public final void W1() {
        View view = this.A;
        if (view == null) {
            view = null;
        }
        view.setVisibility(8);
        View view2 = this.B;
        if (view2 == null) {
            view2 = null;
        }
        view2.setVisibility(0);
        VkButton vkButton = this.C;
        (vkButton != null ? vkButton : null).setVisibility(8);
    }

    public final void X1() {
        View view = this.A;
        if (view == null) {
            view = null;
        }
        view.setVisibility(8);
        View view2 = this.B;
        if (view2 == null) {
            view2 = null;
        }
        view2.setVisibility(8);
        VkButton vkButton = this.C;
        (vkButton != null ? vkButton : null).setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    public final io.reactivex.rxjava3.core.a Y1(PrivacySetting privacySetting) {
        List list;
        int i;
        if (privacySetting == null) {
            return i.b;
        }
        String str = privacySetting.b;
        HashMap hashMap = this.L;
        med0 med0Var = (med0) hashMap.get(str);
        if (med0Var == null) {
            med0Var = new med0(this, (NewsfeedRouter) this.w.getValue());
            med0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            LinearLayout linearLayout = this.D;
            if (linearLayout == null) {
                linearLayout = null;
            }
            linearLayout.addView(med0Var);
            hashMap.put(privacySetting.b, med0Var);
        }
        int i2 = epx.f(privacySetting.b, "stories_exclude") ? 9988 : 9987;
        dam0 dam0Var = this.v;
        jed0 jed0Var = (jed0) dam0Var.a.getValue();
        jed0Var.getClass();
        x<String> b2 = jed0Var.b(privacySetting.e);
        LinkedHashSet<String> linkedHashSet = dam0.d;
        PrivacyRules.Exclude a2 = dam0.a.a(privacySetting);
        if (a2 != null) {
            HashSet hashSet = a2.b;
            list = j5g.H0(new ArrayList(hashSet), 3);
            i = new ArrayList(hashSet).size();
        } else {
            list = EmptyList.b;
            i = 0;
        }
        List list2 = list;
        b0 k = list2.isEmpty() ? x.k(new ned0.a(EmptyList.b, i)) : rsg0.W(yfb.x(r1r0.a.b((s1r0) dam0Var.b.getValue(), list2, Collections.singletonList(UsersFieldsDto.PHOTO_BASE), null, null, 58)), 7).l(new je40(new cam0(i, dam0Var), 10));
        kb10 kb10Var = new kb10(privacySetting, i2, 2);
        int i3 = 12;
        return new p(new o(x.B(b2, k, new ie40(kb10Var, i3)).m(asu0.a.d()), new ox80(new ie90(med0Var, 20), i3)).h(new o3y(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 21)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void Z1() {
        this.O.b(((bsl0) this.x.getValue()).d().m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new x150(new qzl0(this, 3), 13), new pmu(new b(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 22)));
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        PrivacySetting privacySetting;
        ArrayList<String> stringArrayListExtra;
        super.onActivityResult(i, i2, intent);
        io.reactivex.rxjava3.disposables.b bVar = this.O;
        if (i == 9987 && intent != null) {
            PrivacySetting privacySetting2 = (PrivacySetting) intent.getParcelableExtra("setting");
            W1();
            bVar.b(Y1(privacySetting2).i(new hu50(new whg0(this, 10), 23)).g(new jg4(this, 4)).subscribe());
        }
        if (i == 9988 && i2 == -1) {
            ArrayList arrayList = new ArrayList();
            if (intent != null && (stringArrayListExtra = intent.getStringArrayListExtra("chosen_friends_ids")) != null) {
                arrayList.addAll(stringArrayListExtra);
            }
            med0 med0Var = (med0) this.L.get("stories_exclude");
            if (med0Var == null || (privacySetting = med0Var.getPrivacySetting()) == null) {
                return;
            }
            privacySetting.e = new ArrayList();
            PrivacyRules.Exclude exclude = new PrivacyRules.Exclude();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                exclude.Fb(new UserId(Long.parseLong((String) it.next())));
            }
            if (!exclude.c.isEmpty()) {
                privacySetting.e.add(exclude);
            }
            bVar.b(Y1(privacySetting).i(new xj50(new f6m0(this, 1), 14)).g(new kz(this, 5)).subscribe());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        dhr0.a.getClass();
        setTheme(dhr0.u().c);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            this.N = (MobileOfficialAppsConStoriesStat$ViewEntryPoint) extras.getSerializable("INTENT_VIEW_ENTRY_POINT");
        }
        if (this.N == null) {
            this.N = MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER;
        }
        setContentView(R.layout.activity_story_settings);
        this.A = findViewById(R.id.ll_stories_scroll_content);
        this.B = findViewById(R.id.ll_stories_progress);
        this.C = (VkButton) findViewById(R.id.stories_reload);
        this.D = (LinearLayout) findViewById(R.id.ll_stories_privacy_holder);
        VkGroupHeader vkGroupHeader = (VkGroupHeader) findViewById(R.id.stories_privacy_label);
        vkGroupHeader.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, R.string.story_setting_camera_privacy_title), null, null, null, 0, 510));
        this.E = vkGroupHeader;
        VkButton vkButton = this.C;
        if (vkButton == null) {
            vkButton = null;
        }
        int i2 = 12;
        vkButton.setOnClickListener(new a06(this, 12));
        l7s u = bwt0.u(this);
        VkTopBar vkTopBar = (VkTopBar) findViewById(R.id.toolbar);
        int i3 = 4;
        int i4 = 3;
        vkTopBar.setBack(new VkTopBar.b(new z4d0(this, 15), new tlo0.f(R.string.accessibility_close), null, null, com.vk.core.compose.component.semantics.b.a(null, new l4k0(i3), 3), 12));
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(R.string.story_setting_camera_title), null, null, null, null, 30), null, null, com.vk.core.compose.component.semantics.b.a(null, new m4k0(i3), 3), 6));
        ((VkGroupHeader) findViewById(R.id.general_gh)).setTitle(new VkGroupHeader.d(new tlo0.f(R.string.story_setting_camera_general), null, null, null, 0, 510));
        VkCell vkCell = (VkCell) findViewById(R.id.hidden_from_stories);
        vkCell.setBackground(e3m.e(R.attr.vk_ui_background_content, vkCell.getContext()));
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        VkCell.Middle.d.b.C0815b c0815b = null;
        int i5 = 62;
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e((tlo0) new tlo0.f(R.string.hidden_from_stories), 0, (TextUtils.TruncateAt) (0 == true ? 1 : 0), (VkCell.Middle.e.b) (0 == true ? 1 : 0), (VkCell.Middle.e.b) (0 == true ? 1 : 0), 62), new VkCell.Middle.d((tlo0) new tlo0.f(R.string.hidden_from_stories_desc_redesign), (gzs) null, 0, (TextUtils.TruncateAt) (0 == true ? 1 : 0), (VkCell.Middle.d.b.C0815b) (0 == true ? 1 : 0), c0815b, i5), null, 12));
        vkCell.setOnClickListener(new vw0(this, 15));
        VkCell vkCell2 = (VkCell) findViewById(R.id.save_stories);
        vkCell2.setBackground(e3m.e(R.attr.vk_ui_background_content, vkCell2.getContext()));
        vkCell2.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e((tlo0) new tlo0.f(R.string.save_stories), 0, (TextUtils.TruncateAt) (0 == true ? 1 : 0), (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) (0 == true ? 1 : 0), 62), new VkCell.Middle.d((tlo0) new tlo0.f(R.string.story_setting_camera_save_description), (gzs) (0 == true ? 1 : 0), 0, (TextUtils.TruncateAt) (0 == true ? 1 : 0), (VkCell.Middle.d.b.C0815b) null, c0815b, i5), null, 12));
        this.G = vkCell2;
        boolean a2 = ((evl0) this.z.getValue()).a();
        VkCell vkCell3 = this.G;
        if (vkCell3 == null) {
            vkCell3 = null;
        }
        vkCell3.setRight(T1(a2, new ns6(this, a2, i4)));
        int i6 = 1;
        Object[] objArr = extras != null && extras.getBoolean("INTENT_IS_CAMERA_60FPS_AVAILABLE ", false);
        VkCell vkCell4 = (VkCell) findViewById(R.id.camera_60fps);
        this.H = vkCell4;
        if (objArr == true) {
            vkCell4.setBackground(e3m.e(R.attr.vk_ui_background_content, vkCell4.getContext()));
            vkCell4.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(new tlo0.f(R.string.story_setting_camera_60fps), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
            bpn0 bpn0Var = ni9.a;
            boolean z = Preference.f("clips_camera_settings").getBoolean("clips_camera_60_fps", true);
            VkCell vkCell5 = this.H;
            if (vkCell5 == null) {
                vkCell5 = null;
            }
            vkCell5.setRight(T1(z, new ei30(z, this, i6)));
        } else {
            vkCell4.setVisibility(8);
        }
        VkCell vkCell6 = (VkCell) findViewById(R.id.camera_grid);
        vkCell6.setBackground(e3m.e(R.attr.vk_ui_background_content, vkCell6.getContext()));
        vkCell6.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(new tlo0.f(R.string.story_setting_camera_grid), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
        this.I = vkCell6;
        r870.a().b().getClass();
        boolean z2 = Preference.f("clips_camera_settings").getBoolean("camera_grid", false);
        VkCell vkCell7 = this.I;
        if (vkCell7 == null) {
            vkCell7 = null;
        }
        vkCell7.setRight(T1(z2, new dkj0(this, z2)));
        if (!BuildInfo.s()) {
            VkCell vkCell8 = this.I;
            if (vkCell8 == null) {
                vkCell8 = null;
            }
            vkCell8.setVisibility(8);
            VkCell vkCell9 = this.G;
            if (vkCell9 == null) {
                vkCell9 = null;
            }
            vkCell9.setVisibility(8);
        }
        VkCellButton vkCellButton = (VkCellButton) findViewById(R.id.clear_masks_cache);
        vkCellButton.setBackground(e3m.e(R.attr.vk_ui_background_content, vkCellButton.getContext()));
        vkCellButton.setOnClickListener(new y01(this, i2));
        vkCellButton.setAppearance(Appearance.Negative);
        vkCellButton.setTitle(R.string.story_setting_camera_clean_masks_cache);
        this.F = vkCellButton;
        VkGroupHeader vkGroupHeader2 = (VkGroupHeader) findViewById(R.id.discover_group_header);
        vkGroupHeader2.setTitle(new VkGroupHeader.d(new tlo0.f(R.string.stories_discover_feed_title), null, null, null, 0, 510));
        StoriesFeatures storiesFeatures = StoriesFeatures.NEW_DISCOVER_ICON;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures)) {
            gko.b bVar = gko.Companion;
            i = R.drawable.vk_icon_hand_wave_circle_fill_violet_28;
        } else {
            gko.b bVar2 = gko.Companion;
            i = R.drawable.vk_icon_compass_circle_fill_purple_28;
        }
        gko gkoVar = new gko(i);
        int i7 = 6;
        vkGroupHeader2.setLeft(new VkGroupHeader.a.C0842a(gkoVar, null, 6));
        VkCell vkCell10 = (VkCell) findViewById(R.id.show_discover);
        vkCell10.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(new tlo0.f(R.string.stories_settings_show_block), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
        this.J = vkCell10;
        View findViewById = findViewById(R.id.general_ll);
        float a3 = iah0.a(20);
        s0w0 s0w0Var = new s0w0(a3, true, false);
        s0w0 s0w0Var2 = new s0w0(a3, false, true);
        findViewById.setOutlineProvider(s0w0Var);
        findViewById.setClipToOutline(true);
        VkGroupHeader vkGroupHeader3 = this.E;
        if (vkGroupHeader3 == null) {
            vkGroupHeader3 = null;
        }
        vkGroupHeader3.setOutlineProvider(s0w0Var2);
        VkGroupHeader vkGroupHeader4 = this.E;
        if (vkGroupHeader4 == null) {
            vkGroupHeader4 = null;
        }
        vkGroupHeader4.setClipToOutline(true);
        LinearLayout linearLayout = this.D;
        if (linearLayout == null) {
            linearLayout = null;
        }
        linearLayout.setOutlineProvider(s0w0Var);
        LinearLayout linearLayout2 = this.D;
        (linearLayout2 != null ? linearLayout2 : null).setClipToOutline(true);
        View findViewById2 = findViewById(R.id.ll_discover_settings);
        findViewById2.setOutlineProvider(new s0w0(a3, false, true));
        findViewById2.setClipToOutline(true);
        s0 s0Var = new s0(new ldm0());
        asu0 asu0Var = asu0.a;
        this.O.b(s0Var.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new k5j0(new mcj0(this, i7), 5), new t520(new foh(com.vk.metrics.eventtracking.b.a, 8), 23)));
        mnh0.y(dhr0.Y(R.attr.vk_ui_header_background, u), this);
        dhr0.u0(getWindow(), NavigationBarStyle.DARK);
    }

    @Override // com.vk.pushes.PushAwareActivity, com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (this.M) {
            Z1();
        } else {
            U1();
        }
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.O.e();
    }
}
