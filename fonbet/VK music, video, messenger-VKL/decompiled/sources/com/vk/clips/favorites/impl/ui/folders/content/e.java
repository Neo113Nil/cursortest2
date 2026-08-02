package com.vk.clips.favorites.impl.ui.folders.content;

import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.favorites.impl.ui.folders.content.a;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.i3e;
import xsna.izs;
import xsna.tlo0;
import xsna.tq;

/* compiled from: ClipsFavoriteFolderContentListReducer.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class e extends FunctionReferenceImpl implements izs<ClipsFavoriteFolderContentListState, ClipsFavoriteFolderContentListViewState.e> {
    @Override // xsna.izs
    public final ClipsFavoriteFolderContentListViewState.e invoke(ClipsFavoriteFolderContentListState clipsFavoriteFolderContentListState) {
        ClipsFavoriteFolderContentListState clipsFavoriteFolderContentListState2 = clipsFavoriteFolderContentListState;
        f fVar = (f) this.receiver;
        fVar.getClass();
        if (clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.Content) {
            ClipsFavoriteFolderContentListState.Content content = (ClipsFavoriteFolderContentListState.Content) clipsFavoriteFolderContentListState2;
            if (content.c instanceof ClipsFavoriteFolderContentListState.c.a) {
                i3e i3eVar = fVar.g;
                boolean isEmpty = content.d.isEmpty();
                boolean z = fVar.d.b() instanceof FavoriteFolderId.Alias.AllClips;
                i3eVar.getClass();
                ArrayList arrayList = new ArrayList();
                if (!isEmpty) {
                    arrayList.add(new ClipsFavoriteFolderContentListViewState.f(R.drawable.vk_icon_check_circle_outline_28, R.attr.vk_ui_icon_accent_themed, tq.h(tlo0.Companion, R.string.clips_favorites_folder_content_list_action_select_clips), a.e.C0590e.b));
                }
                if (!z) {
                    if (!isEmpty) {
                        arrayList.add(new ClipsFavoriteFolderContentListViewState.f(R.drawable.vk_icon_list_add_outline_28, R.attr.vk_ui_icon_accent_themed, tq.h(tlo0.Companion, R.string.clips_favorites_folder_content_list_action_add_clips), a.InterfaceC0586a.C0587a.b));
                    }
                    arrayList.add(new ClipsFavoriteFolderContentListViewState.f(R.drawable.vk_icon_write_outline_28, R.attr.vk_ui_icon_accent_themed, tq.h(tlo0.Companion, R.string.clips_favorites_folder_content_list_action_rename_folder), a.InterfaceC0586a.d.b));
                    arrayList.add(new ClipsFavoriteFolderContentListViewState.f(R.drawable.vk_icon_delete_outline_android_28, R.attr.vk_ui_icon_negative, new tlo0.f(R.string.clips_favorites_folder_content_list_action_delete_folder), a.InterfaceC0586a.b.b));
                }
                if (!arrayList.isEmpty()) {
                    return new ClipsFavoriteFolderContentListViewState.e.b(arrayList);
                }
            }
        }
        return ClipsFavoriteFolderContentListViewState.e.a.a;
    }
}
