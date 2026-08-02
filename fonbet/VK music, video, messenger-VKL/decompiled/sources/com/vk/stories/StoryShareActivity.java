package com.vk.stories;

import android.content.Intent;
import android.net.Uri;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.stories.entities.StoryCameraGalleryData;
import com.vk.sharing.core.view.IntentAction;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.stat.AppStartReporter;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import com.vkontakte.android.sharing.SharingExternalActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import xsna.l93;
import xsna.ze6;

/* compiled from: StoryShareActivity.kt */
/* loaded from: classes6.dex */
public final class StoryShareActivity extends SharingExternalActivity {
    @Override // com.vkontakte.android.sharing.SharingExternalActivity, com.vk.sharing.im_engine_impl.BaseSharingExternalActivity
    public final void K3() {
        AppStartReporter.c(AppStartReporter.StartMethod.SHARING, false, this, new l93(), false);
    }

    @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity
    public final ze6 T2(Intent intent) {
        if (!intent.hasExtra("android.intent.extra.STREAM")) {
            UiTracker uiTracker = UiTracker.a;
            return new BaseSharingExternalActivity.j(UiTracker.c());
        }
        String action = intent.getAction();
        BaseSharingExternalActivity.SharedItems sharedItems = new BaseSharingExternalActivity.SharedItems();
        if ("android.intent.action.SEND_MULTIPLE".equals(action)) {
            List<Uri> parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            if (parcelableArrayListExtra == null) {
                parcelableArrayListExtra = EmptyList.b;
            }
            for (Uri uri : parcelableArrayListExtra) {
                if (!com.vk.core.files.a.c.b(uri)) {
                    UiTracker uiTracker2 = UiTracker.a;
                    return new BaseSharingExternalActivity.j(UiTracker.c());
                }
                sharedItems.add(new BaseSharingExternalActivity.g(com.vk.core.files.a.G(uri), uri));
            }
        } else if ("android.intent.action.SEND".equals(action)) {
            Uri uri2 = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
            if (uri2 == null || !com.vk.core.files.a.c.b(uri2)) {
                UiTracker uiTracker3 = UiTracker.a;
                return new BaseSharingExternalActivity.j(UiTracker.c());
            }
            sharedItems.add(new BaseSharingExternalActivity.g(com.vk.core.files.a.G(uri2), uri2));
        }
        return new a(sharedItems);
    }

    /* compiled from: StoryShareActivity.kt */
    public final class a extends ze6<MobileOfficialAppsCoreNavStat$EventScreen> {
        public final ArrayList c;

        public a(BaseSharingExternalActivity.SharedItems sharedItems) {
            super(MobileOfficialAppsCoreNavStat$EventScreen.STORY_EDITOR);
            ArrayList arrayList = new ArrayList();
            Iterator<BaseSharingExternalActivity.g> it = sharedItems.iterator();
            while (it.hasNext()) {
                BaseSharingExternalActivity.g next = it.next();
                int i = next.a;
                Uri uri = next.b;
                arrayList.add(i == 2 ? new StoryCameraGalleryData(uri, true, false, false, 12, null) : i == 3 ? new StoryCameraGalleryData(uri, false, false, false, 12, null) : new StoryCameraGalleryData(uri, true, false, true, 4, null));
            }
            this.c = arrayList;
        }

        @Override // xsna.ze6
        public final IntentAction[] a() {
            return null;
        }

        @Override // xsna.ze6
        public final MobileOfficialAppsCoreNavStat$EventScreen c() {
            com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(SchemeStat$TypeNavgo.Subtype.SYSTEM.name().toLowerCase(Locale.ROOT), MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.SYSTEM_SHARING);
            aVar.G = this.c;
            StoryShareActivity storyShareActivity = StoryShareActivity.this;
            aVar.C(storyShareActivity);
            storyShareActivity.finish();
            return this.a;
        }

        @Override // xsna.ze6
        public final void d(IntentAction intentAction) {
        }

        @Override // xsna.ze6
        public final void e(PhotoAlbum photoAlbum) {
        }

        @Override // xsna.ze6
        public final void f(UserId userId, String str) {
        }
    }
}
