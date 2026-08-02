package com.vk.sdk.api.newsfeed.dto;

import com.vk.dto.common.id.UserId;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.i5s;
import xsna.pmi0;
import xsna.up;
import xsna.urd0;
import xsna.xe9;
import xsna.z8y;
import xsna.zcl;

/* compiled from: NewsfeedMediaDiscoverActionDto.kt */
/* loaded from: classes5.dex */
public abstract class NewsfeedMediaDiscoverActionDto {

    /* compiled from: NewsfeedMediaDiscoverActionDto.kt */
    public static final class Deserializer implements a9y<NewsfeedMediaDiscoverActionDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            throw new IllegalStateException(go9.b("no mapping for the type:", up.f(b9yVar, "type")));
        }
    }

    /* compiled from: NewsfeedMediaDiscoverActionDto.kt */
    public static final class NewsfeedMediaDiscoverActionClipDto extends NewsfeedMediaDiscoverActionDto {

        @pmi0("clip_id")
        private final Integer clipId;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("screen_title")
        private final String screenTitle;

        @pmi0("type")
        private final String type;

        public /* synthetic */ NewsfeedMediaDiscoverActionClipDto(String str, String str2, UserId userId, Integer num, int i, zcl zclVar) {
            this(str, str2, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : num);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedMediaDiscoverActionClipDto)) {
                return false;
            }
            NewsfeedMediaDiscoverActionClipDto newsfeedMediaDiscoverActionClipDto = (NewsfeedMediaDiscoverActionClipDto) obj;
            return epx.f(this.type, newsfeedMediaDiscoverActionClipDto.type) && epx.f(this.screenTitle, newsfeedMediaDiscoverActionClipDto.screenTitle) && epx.f(this.ownerId, newsfeedMediaDiscoverActionClipDto.ownerId) && epx.f(this.clipId, newsfeedMediaDiscoverActionClipDto.clipId);
        }

        public final int hashCode() {
            int a = urd0.a(this.type.hashCode() * 31, 31, this.screenTitle);
            UserId userId = this.ownerId;
            int hashCode = (a + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            Integer num = this.clipId;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            String str = this.type;
            String str2 = this.screenTitle;
            UserId userId = this.ownerId;
            Integer num = this.clipId;
            StringBuilder a = xe9.a("NewsfeedMediaDiscoverActionClipDto(type=", str, ", screenTitle=", str2, ", ownerId=");
            a.append(userId);
            a.append(", clipId=");
            a.append(num);
            a.append(")");
            return a.toString();
        }

        public NewsfeedMediaDiscoverActionClipDto(String str, String str2, UserId userId, Integer num) {
            super(null);
            this.type = str;
            this.screenTitle = str2;
            this.ownerId = userId;
            this.clipId = num;
        }
    }

    /* compiled from: NewsfeedMediaDiscoverActionDto.kt */
    public static final class NewsfeedMediaDiscoverActionPostDto extends NewsfeedMediaDiscoverActionDto {

        @pmi0("feed_id")
        private final String feedId;

        @pmi0("screen_title")
        private final String screenTitle;

        @pmi0("type")
        private final String type;

        public NewsfeedMediaDiscoverActionPostDto(String str, String str2, String str3) {
            super(null);
            this.type = str;
            this.feedId = str2;
            this.screenTitle = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedMediaDiscoverActionPostDto)) {
                return false;
            }
            NewsfeedMediaDiscoverActionPostDto newsfeedMediaDiscoverActionPostDto = (NewsfeedMediaDiscoverActionPostDto) obj;
            return epx.f(this.type, newsfeedMediaDiscoverActionPostDto.type) && epx.f(this.feedId, newsfeedMediaDiscoverActionPostDto.feedId) && epx.f(this.screenTitle, newsfeedMediaDiscoverActionPostDto.screenTitle);
        }

        public final int hashCode() {
            return this.screenTitle.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.feedId);
        }

        public final String toString() {
            String str = this.type;
            String str2 = this.feedId;
            return i5s.a(xe9.a("NewsfeedMediaDiscoverActionPostDto(type=", str, ", feedId=", str2, ", screenTitle="), this.screenTitle, ")");
        }
    }

    public /* synthetic */ NewsfeedMediaDiscoverActionDto(zcl zclVar) {
        this();
    }

    private NewsfeedMediaDiscoverActionDto() {
    }
}
