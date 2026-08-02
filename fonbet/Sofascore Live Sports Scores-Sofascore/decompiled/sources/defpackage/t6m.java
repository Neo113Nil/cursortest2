package defpackage;

import com.blaze.blazesdk.features.stories.models.local.StoryPageStatus;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t6m extends ap5 {
    public t6m(k6g k6gVar) {
        super(k6gVar, 1);
    }

    @Override // defpackage.y0
    public final String c() {
        return "INSERT INTO `stories_pages_status` (`page_id`,`story_id`,`is_synced`) VALUES (?,?,?)";
    }

    @Override // defpackage.ap5
    public final void v(mni mniVar, Object obj) {
        StoryPageStatus storyPageStatus = (StoryPageStatus) obj;
        if (storyPageStatus.getPageId() == null) {
            mniVar.s(1);
        } else {
            mniVar.m0(1, storyPageStatus.getPageId());
        }
        if (storyPageStatus.getStoryId() == null) {
            mniVar.s(2);
        } else {
            mniVar.m0(2, storyPageStatus.getStoryId());
        }
        mniVar.q(3, storyPageStatus.isSynced() ? 1L : 0L);
    }
}
