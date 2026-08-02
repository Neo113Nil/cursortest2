package com.vk.newsfeed.impl.requests;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.wall.dto.WallGetByIdExtendedResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Collections;
import xsna.awi;
import xsna.e43;
import xsna.l7r0;
import xsna.max0;
import xsna.n9x0;
import xsna.tfx;
import xsna.vga0;
import xsna.yfb;
import xsna.zil0;

/* compiled from: WallReveal.kt */
/* loaded from: classes4.dex */
public final class b extends awi<Post> {
    public final n9x0 s;
    public final UserId t;
    public final int u;

    public b(n9x0 n9x0Var, UserId userId, int i) {
        this.s = n9x0Var;
        this.t = userId;
        this.u = i;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        max0 max0Var = new max0();
        tfx tfxVar = new tfx("wall.reveal", new zil0(6), new vga0(9));
        int i = this.u;
        tfx.l(tfxVar, "post_id", i, 0, 0, 8);
        if (((BaseOkResponseDto) yfb.x(tfxVar).f(l7r0Var)) != BaseOkResponseDto.OK) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.t);
        sb.append('_');
        sb.append(i);
        NewsEntry a = n9x0.a(this.s, (WallGetByIdExtendedResponseDto) yfb.x(max0Var.h(Collections.singletonList(sb.toString()), e43.l(BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.SEX, BaseUserGroupFieldsDto.VIDEO_FILES, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.VERIFIED))).f(l7r0Var));
        if (a == null || !(a instanceof Post)) {
            return null;
        }
        return (Post) a;
    }
}
