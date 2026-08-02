package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.Objects;
import xsna.epx;
import xsna.qjg;

/* compiled from: UIBlockMusicUnfollowOwnerButton.kt */
/* loaded from: classes16.dex */
public final class UIBlockMusicUnfollowOwnerButton extends UIBlockAction {
    public static final Serializer.c<UIBlockMusicUnfollowOwnerButton> CREATOR = new a();
    public final String A;
    public final UserId z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockMusicUnfollowOwnerButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockMusicUnfollowOwnerButton a(Serializer serializer) {
            return new UIBlockMusicUnfollowOwnerButton(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockMusicUnfollowOwnerButton[i];
        }
    }

    public UIBlockMusicUnfollowOwnerButton(Serializer serializer) {
        super(serializer);
        this.z = (UserId) serializer.A(UserId.class.getClassLoader());
        this.A = serializer.H();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.e0(this.z);
        serializer.j0(this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockMusicUnfollowOwnerButton zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        UIBlockHint uIBlockHint = this.j;
        return new UIBlockMusicUnfollowOwnerButton(Ab, uIBlockHint != null ? uIBlockHint.zb() : null, this.y, UserId.a(this.z), this.A);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockMusicUnfollowOwnerButton)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockMusicUnfollowOwnerButton uIBlockMusicUnfollowOwnerButton = (UIBlockMusicUnfollowOwnerButton) obj;
        return epx.f(this.z, uIBlockMusicUnfollowOwnerButton.z) && epx.f(this.A, uIBlockMusicUnfollowOwnerButton.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + "<[" + this.d + "]>";
    }

    public UIBlockMusicUnfollowOwnerButton(com.vk.catalog2.common.dto.api.ui.a aVar, UIBlockHint uIBlockHint, String str, UserId userId, String str2) {
        super(aVar.a, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, uIBlockHint, str, null, null, null, 3584, null);
        this.z = userId;
        this.A = str2;
    }
}
