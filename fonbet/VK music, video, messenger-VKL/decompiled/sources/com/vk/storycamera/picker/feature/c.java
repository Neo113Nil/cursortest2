package com.vk.storycamera.picker.feature;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraGalleryData;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.cqm0;
import xsna.cvk;
import xsna.e43;
import xsna.ey50;
import xsna.fkq0;
import xsna.ny10;
import xsna.ww50;
import xsna.xa4;

/* compiled from: StoryMediaPickerNavigator.kt */
/* loaded from: classes6.dex */
public final class c {
    public final FragmentImpl a;
    public final StoryCameraParams b;
    public final StoryMediaPickerFragment.d c;

    public c(FragmentImpl fragmentImpl, StoryCameraParams storyCameraParams, StoryMediaPickerFragment.d dVar) {
        this.a = fragmentImpl;
        this.b = storyCameraParams;
        this.c = dVar;
    }

    public static Bundle c(List list) {
        boolean z;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        boolean[] zArr = new boolean[list.size()];
        boolean[] zArr2 = new boolean[list.size()];
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) obj;
            arrayList.add(mediaStoreEntry.f());
            boolean z2 = mediaStoreEntry instanceof MediaStoreVideoEntry;
            zArr[i] = z2;
            if (!z2) {
                if (mediaStoreEntry.getHeight() + mediaStoreEntry.getWidth() > 24000) {
                    z = true;
                    zArr2[i] = z;
                    i = i2;
                }
            }
            z = false;
            zArr2[i] = z;
            i = i2;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("result_files", arrayList);
        bundle.putBooleanArray("result_video_flags", zArr);
        bundle.putBooleanArray("result_send_as_file_flags", zArr2);
        return bundle;
    }

    public final StoryCameraParams a() {
        StoryCameraParams storyCameraParams = this.b;
        if (storyCameraParams != null) {
            return storyCameraParams;
        }
        StoryCameraMode storyCameraMode = StoryCameraMode.STORY;
        ArrayList q = xa4.q();
        EmptyList emptyList = EmptyList.b;
        UserId userId = UserId.d;
        StoryCameraTarget storyCameraTarget = StoryCameraTarget.UNDEFINED;
        ArrayList arrayList = new ArrayList();
        Iterator it = q.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            emptyList.getClass();
            arrayList.add(next);
        }
        return new StoryCameraParams("", "new_story_avatar", storyCameraMode, arrayList, null, userId, null, null, null, null, false, false, null, storyCameraTarget, null, 0L, null, null, null, null, null, null, null, null, false, false, false, null, false, false, null, null, null, null, null, null, null, null, null, null, false, true, true, true, true, true, true, false, null, null, null, Boolean.valueOf(!fkq0.b(userId)), null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, true, true, true, true, true, null, emptyList, false, null, null);
    }

    public final void b(Intent intent) {
        Bundle bundleExtra;
        if (intent == null || (bundleExtra = intent.getBundleExtra("result_attachments")) == null) {
            return;
        }
        Iterable parcelableArrayList = bundleExtra.getParcelableArrayList("result_files");
        if (parcelableArrayList == null) {
            parcelableArrayList = EmptyList.b;
        }
        Iterable<Uri> iterable = parcelableArrayList;
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        for (Uri uri : iterable) {
            arrayList.add(com.vk.core.files.a.G(uri) == 3 ? new StoryCameraGalleryData(uri, false, false, false, 12, null) : new StoryCameraGalleryData(uri, true, false, false, 12, null));
        }
        if (arrayList.isEmpty()) {
            cvk.u(R.string.story_gallery_message_attach_error, false);
        } else {
            d(arrayList, intent.getBundleExtra("TRANSITION_BUNDLE"), false);
        }
    }

    public final void d(List<StoryCameraGalleryData> list, Bundle bundle, boolean z) {
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(a().b, a().c);
        aVar.b(a());
        aVar.m0 = true;
        aVar.G = list;
        aVar.s0 = bundle != null;
        StoryCameraParams.a.y(aVar, z);
        FragmentImpl fragmentImpl = this.a;
        Intent B = aVar.B(fragmentImpl.kn(), true);
        LayoutInflater.Factory activity = fragmentImpl.getActivity();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
        if (Y == null || !Y.q(2241, B, fragmentImpl)) {
            fragmentImpl.startActivityForResult(B, 2241, bundle);
        }
        ny10.a(cqm0.m(a().c), list);
    }
}
