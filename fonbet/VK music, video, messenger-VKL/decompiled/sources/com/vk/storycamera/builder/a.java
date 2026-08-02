package com.vk.storycamera.builder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.storycamera.screen.StoryCameraActivity;
import com.vk.storycamera.screen.StoryGalleryActivity;
import com.vk.superapp.api.dto.story.WebServiceInfo;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Locale;
import xsna.bwt0;
import xsna.e43;
import xsna.enj;
import xsna.l7s;
import xsna.nf9;
import xsna.ozl;
import xsna.u90;

/* compiled from: StoryCameraBuilder.kt */
/* loaded from: classes6.dex */
public final class a extends StoryCameraParams.a {
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public StoryBoxPrepared H0;

    @ozl
    public a(String str, String str2) {
        super(str, str2);
    }

    public final void A(StoryBoxPrepared storyBoxPrepared) {
        this.H0 = storyBoxPrepared;
        WebStoryBox webStoryBox = storyBoxPrepared.b;
        this.i = storyBoxPrepared.c;
        this.y = webStoryBox;
        Integer num = storyBoxPrepared.d;
        this.B = num;
        WebServiceInfo webServiceInfo = webStoryBox.i;
        this.m = webServiceInfo != null ? webServiceInfo.b : null;
        this.T = webServiceInfo != null ? webServiceInfo.c : false;
        this.e = webServiceInfo != null ? webServiceInfo.g : null;
        this.d = webServiceInfo != null ? webServiceInfo.j : null;
        this.c = webServiceInfo != null ? webServiceInfo.i : null;
        this.N = storyBoxPrepared.e;
        this.g = e43.o(StoryCameraMode.STORY, StoryCameraMode.STORY_VIDEO);
        this.B = num;
        if (!webStoryBox.Bb()) {
            if (webStoryBox.Cb()) {
                d();
            } else {
                c();
            }
        }
        WebServiceInfo webServiceInfo2 = webStoryBox.i;
        this.c0 = webServiceInfo2 != null ? webServiceInfo2.d : null;
    }

    public final Intent B(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) ((this.E0 || this.G0) ? StoryGalleryActivity.class : StoryCameraActivity.class));
        if (!z) {
            intent.addFlags(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        }
        intent.putExtra("story_box_prepared", this.H0);
        intent.putExtra("camera_params", a());
        nf9 nf9Var = nf9.b;
        Long id = nf9.e().b().getId();
        if (id != null) {
            intent.putExtra("session_id", id.longValue());
        }
        return intent;
    }

    public final void C(Context context) {
        if (!this.E0 && !this.F0) {
            enj.p(context, B(context, false));
            return;
        }
        nf9 nf9Var = nf9.b;
        Long id = nf9.e().b().getId();
        l7s u = bwt0.u(context);
        StoryCameraParams a = a();
        boolean z = this.F0;
        StoryMediaPickerFragment.a aVar = new StoryMediaPickerFragment.a(StoryMediaPickerFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("camera_params", a);
        bundle.putInt("background_color", u.getColor(R.color.vk_black));
        bundle.putBoolean("start_from_template", z);
        if (id != null) {
            bundle.putLong("session_id", id.longValue());
        }
        aVar.s(true);
        aVar.t();
        aVar.w(u.getThemeResId());
        aVar.k(u);
    }

    public final void D(u90 u90Var, int i, Bundle bundle) {
        u90Var.D(B(u90Var.B(), true), i, bundle);
    }

    public final void E() {
        this.G0 = true;
    }

    @ozl
    public a(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str) {
        super(mobileOfficialAppsCoreNavStat$EventScreen.name().toLowerCase(Locale.ROOT), str);
    }

    @ozl
    public a(String str, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint) {
        super(str, creationEntryPoint.name().toLowerCase(Locale.ROOT));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint) {
        super(r2.toLowerCase(r0), creationEntryPoint.name().toLowerCase(r0));
        String name = mobileOfficialAppsCoreNavStat$EventScreen.name();
        Locale locale = Locale.ROOT;
    }
}
