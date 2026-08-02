package com.vk.sharing.core.view;

import com.vkontakte.android.R;

/* loaded from: classes5.dex */
public enum IntentAction {
    SHARE_TO_ALBUM(R.string.share_to_album),
    SHARE_TO_DOCS(R.string.share_to_docs),
    SHARE_TO_WALL(R.string.share_to_wall),
    SHARE_TO_MESSAGE(R.string.share_to_message),
    ADD_TO_MY_VIDEOS(R.string.share_to_videos),
    SHARE_EXTERNAL(R.string.share_external),
    SHARE_IN_STORY(R.string.sharing_action_button_label_story),
    COPY_LINK(R.string.sharing_action_button_label3),
    MAKE_DUET(R.string.sharing_action_button_label_clip_duet),
    ADD_FAVE(R.string.add_to_fave),
    REMOVE_FAVE(R.string.remove_from_fave);

    private final int titleRes;

    IntentAction(int i) {
        this.titleRes = i;
    }

    public final int h() {
        return this.titleRes;
    }
}
