package com.vk.sdk.api.friends.dto;

import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.sdk.api.base.dto.BaseImageDto;
import java.util.List;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.hay;
import xsna.pmi0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: FriendsRecDescriptionGenericDto.kt */
/* loaded from: classes5.dex */
public abstract class FriendsRecDescriptionGenericDto {

    /* compiled from: FriendsRecDescriptionGenericDto.kt */
    public static final class Deserializer implements a9y<FriendsRecDescriptionGenericDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            if (b9yVar instanceof x9y) {
                return (FriendsRecDescriptionGenericDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, FriendsRecDescriptionDto.class);
            }
            hay i = b9yVar.i();
            if (!(i.b instanceof String)) {
                throw new IllegalStateException("no primitive mapping");
            }
            i.k();
            return new a(null);
        }
    }

    /* compiled from: FriendsRecDescriptionGenericDto.kt */
    public static final class FriendsRecDescriptionDto extends FriendsRecDescriptionGenericDto {

        @pmi0("content_type")
        private final FriendsRecDescriptionContentTypeDto contentType;

        @pmi0("icon")
        private final FriendsRecDescriptionIconDto icon;

        @pmi0("images")
        private final List<List<BaseImageDto>> images;

        @pmi0("text")
        private final String text;

        public /* synthetic */ FriendsRecDescriptionDto(FriendsRecDescriptionContentTypeDto friendsRecDescriptionContentTypeDto, FriendsRecDescriptionIconDto friendsRecDescriptionIconDto, String str, List list, int i, zcl zclVar) {
            this(friendsRecDescriptionContentTypeDto, (i & 2) != 0 ? null : friendsRecDescriptionIconDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FriendsRecDescriptionDto)) {
                return false;
            }
            FriendsRecDescriptionDto friendsRecDescriptionDto = (FriendsRecDescriptionDto) obj;
            return this.contentType == friendsRecDescriptionDto.contentType && this.icon == friendsRecDescriptionDto.icon && epx.f(this.text, friendsRecDescriptionDto.text) && epx.f(this.images, friendsRecDescriptionDto.images);
        }

        public final int hashCode() {
            int hashCode = this.contentType.hashCode() * 31;
            FriendsRecDescriptionIconDto friendsRecDescriptionIconDto = this.icon;
            int hashCode2 = (hashCode + (friendsRecDescriptionIconDto == null ? 0 : friendsRecDescriptionIconDto.hashCode())) * 31;
            String str = this.text;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List<List<BaseImageDto>> list = this.images;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return "FriendsRecDescriptionDto(contentType=" + this.contentType + ", icon=" + this.icon + ", text=" + this.text + ", images=" + this.images + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FriendsRecDescriptionDto(FriendsRecDescriptionContentTypeDto friendsRecDescriptionContentTypeDto, FriendsRecDescriptionIconDto friendsRecDescriptionIconDto, String str, List<? extends List<BaseImageDto>> list) {
            super(null);
            this.contentType = friendsRecDescriptionContentTypeDto;
            this.icon = friendsRecDescriptionIconDto;
            this.text = str;
            this.images = list;
        }
    }

    /* compiled from: FriendsRecDescriptionGenericDto.kt */
    public static final class a extends FriendsRecDescriptionGenericDto {
    }

    public /* synthetic */ FriendsRecDescriptionGenericDto(zcl zclVar) {
        this();
    }

    private FriendsRecDescriptionGenericDto() {
    }
}
