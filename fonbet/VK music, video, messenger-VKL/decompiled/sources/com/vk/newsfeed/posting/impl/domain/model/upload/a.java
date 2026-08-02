package com.vk.newsfeed.posting.impl.domain.model.upload;

import android.net.Uri;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.GroupPrivacyType;
import com.vk.newsfeed.posting.impl.presentation.model.GroupWallPostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.UserWallPostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import java.util.ArrayList;
import xsna.j5g;
import xsna.vmc0;
import xsna.w9c0;

/* compiled from: UploadFilter.kt */
/* loaded from: classes4.dex */
public final class a {
    public final w9c0 a;

    public a(w9c0 w9c0Var) {
        this.a = w9c0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        if (r3.b == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(VideoDto videoDto, PostingState.Editing editing) {
        Uri uri;
        ArrayList s0 = j5g.s0(editing.i.p, videoDto);
        if (!videoDto.f.d()) {
            return false;
        }
        String str = videoDto.f.c;
        if (str == null || (uri = Uri.parse(str)) == null) {
            uri = Uri.EMPTY;
        }
        if (this.a.a(uri) && vmc0.a(editing)) {
            PostingSettings postingSettings = editing.d;
            GroupWallPostingSettings groupWallPostingSettings = postingSettings.h;
            if (groupWallPostingSettings != null) {
                if ((groupWallPostingSettings != null ? groupWallPostingSettings.c : null) != GroupPrivacyType.OPEN) {
                    return true;
                }
            } else {
                UserWallPostingSettings userWallPostingSettings = postingSettings.g;
                if (userWallPostingSettings != null) {
                }
            }
            if (s0.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(UploadDto uploadDto, PostingState.Editing editing) {
        if (uploadDto.I4().d() && uploadDto.I4().i) {
            return true;
        }
        return uploadDto instanceof VideoDto ? a((VideoDto) uploadDto, editing) : uploadDto.I4().d();
    }
}
