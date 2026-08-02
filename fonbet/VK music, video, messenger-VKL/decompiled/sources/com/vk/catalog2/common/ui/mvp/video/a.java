package com.vk.catalog2.common.ui.mvp.video;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.vk.catalog2.common.ui.mvp.video.VideoCatalogAlbumBottomSheet;
import com.vk.dto.video.VideoAlbum;
import com.vkontakte.android.R;
import xsna.be50;
import xsna.een0;
import xsna.hg1;
import xsna.his0;
import xsna.hkp;
import xsna.isb0;
import xsna.mcr0;
import xsna.n9m0;
import xsna.s770;
import xsna.sua;
import xsna.whm0;
import xsna.wx40;

/* compiled from: VideoCatalogAlbumBottomSheet.kt */
/* loaded from: classes16.dex */
public final class a extends s770 {
    public final /* synthetic */ Activity c;

    public a(Activity activity) {
        this.c = activity;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        VideoCatalogAlbumBottomSheet.a.EnumC0516a enumC0516a = (VideoCatalogAlbumBottomSheet.a.EnumC0516a) obj;
        TextView textView = (TextView) hkpVar.f(R.id.title);
        int i2 = enumC0516a.i();
        if (i2 == R.id.video_unsubscribe_playlist) {
            his0.v(textView, enumC0516a.h(), R.color.vk_red);
        } else if (i2 == R.id.video_go_to_owner) {
            VideoCatalogAlbumBottomSheet.b bVar = VideoCatalogAlbumBottomSheet.a.h;
            String str = bVar != null ? bVar.a : null;
            if (str == null) {
                return;
            }
            int i3 = 7;
            hg1.b(textView, mcr0.h(Uri.parse(str)).r0(io.reactivex.rxjava3.schedulers.a.b()).U(new wx40(new isb0(10, this.c, textView), 13)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new whm0(new n9m0(textView, 13), i3), new be50(new een0(i3, textView, enumC0516a), 22)));
        } else {
            int i4 = R.attr.vk_ui_action_sheet_text;
            if (i2 == R.id.video_remove_playlist) {
                VideoAlbum videoAlbum = VideoCatalogAlbumBottomSheet.a.c;
                if (videoAlbum != null && sua.p(videoAlbum)) {
                    i4 = R.attr.vk_ui_icon_negative;
                }
                his0.w(textView, enumC0516a.h(), i4);
            } else {
                his0.w(textView, enumC0516a.h(), R.attr.vk_ui_action_sheet_text);
            }
        }
        textView.setText(enumC0516a.j());
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.title));
        return hkpVar;
    }
}
