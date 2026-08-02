package com.vk.dto.status;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.ActionPerformClick;
import java.util.List;
import xsna.epx;
import xsna.qoy;

/* compiled from: StatusImagePopup.kt */
/* loaded from: classes18.dex */
public final class StatusImagePopup extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StatusImagePopup> CREATOR = new a();
    public final StatusImagePopupBackground b;
    public final StatusImagePopupAnimation c;
    public final StatusImagePopupPhoto d;
    public final String e;
    public final String f;
    public final StatusImageParticipants g;
    public final List<LinkButton> h;
    public final String i;
    public final boolean j;
    public final ActionPerformClick k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StatusImagePopup> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StatusImagePopup a(Serializer serializer) {
            return new StatusImagePopup((StatusImagePopupBackground) serializer.G(StatusImagePopupBackground.class.getClassLoader()), (StatusImagePopupAnimation) serializer.G(StatusImagePopupAnimation.class.getClassLoader()), (StatusImagePopupPhoto) serializer.G(StatusImagePopupPhoto.class.getClassLoader()), serializer.H(), serializer.H(), (StatusImageParticipants) serializer.G(StatusImageParticipants.class.getClassLoader()), serializer.k(LinkButton.class), serializer.H(), serializer.m(), (ActionPerformClick) serializer.G(ActionPerformClick.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StatusImagePopup[i];
        }
    }

    public StatusImagePopup(StatusImagePopupBackground statusImagePopupBackground, StatusImagePopupAnimation statusImagePopupAnimation, StatusImagePopupPhoto statusImagePopupPhoto, String str, String str2, StatusImageParticipants statusImageParticipants, List<LinkButton> list, String str3, boolean z, ActionPerformClick actionPerformClick) {
        this.b = statusImagePopupBackground;
        this.c = statusImagePopupAnimation;
        this.d = statusImagePopupPhoto;
        this.e = str;
        this.f = str2;
        this.g = statusImageParticipants;
        this.h = list;
        this.i = str3;
        this.j = z;
        this.k = actionPerformClick;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.i0(this.g);
        serializer.W(this.h);
        serializer.j0(this.i);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.i0(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusImagePopup)) {
            return false;
        }
        StatusImagePopup statusImagePopup = (StatusImagePopup) obj;
        return epx.f(this.b, statusImagePopup.b) && epx.f(this.c, statusImagePopup.c) && epx.f(this.d, statusImagePopup.d) && epx.f(this.e, statusImagePopup.e) && epx.f(this.f, statusImagePopup.f) && epx.f(this.g, statusImagePopup.g) && epx.f(this.h, statusImagePopup.h) && epx.f(this.i, statusImagePopup.i) && this.j == statusImagePopup.j && epx.f(this.k, statusImagePopup.k);
    }

    public final int hashCode() {
        StatusImagePopupBackground statusImagePopupBackground = this.b;
        int hashCode = (statusImagePopupBackground == null ? 0 : statusImagePopupBackground.hashCode()) * 31;
        StatusImagePopupAnimation statusImagePopupAnimation = this.c;
        int hashCode2 = (hashCode + (statusImagePopupAnimation == null ? 0 : statusImagePopupAnimation.hashCode())) * 31;
        StatusImagePopupPhoto statusImagePopupPhoto = this.d;
        int hashCode3 = (hashCode2 + (statusImagePopupPhoto == null ? 0 : statusImagePopupPhoto.hashCode())) * 31;
        String str = this.e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StatusImageParticipants statusImageParticipants = this.g;
        int hashCode6 = (hashCode5 + (statusImageParticipants == null ? 0 : statusImageParticipants.hashCode())) * 31;
        List<LinkButton> list = this.h;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.i;
        int b = qoy.b((hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.j);
        ActionPerformClick actionPerformClick = this.k;
        return b + (actionPerformClick != null ? actionPerformClick.c.hashCode() : 0);
    }

    public final String toString() {
        return "StatusImagePopup(background=" + this.b + ", animation=" + this.c + ", photo=" + this.d + ", title=" + this.e + ", text=" + this.f + ", participants=" + this.g + ", buttons=" + this.h + ", terms=" + this.i + ", canClose=" + this.j + ", closeAction=" + this.k + ')';
    }
}
