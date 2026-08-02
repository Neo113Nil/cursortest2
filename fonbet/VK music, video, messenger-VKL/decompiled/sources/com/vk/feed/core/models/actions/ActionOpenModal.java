package com.vk.feed.core.models.actions;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ThemedColor;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.actions.HeaderAction;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.Map;
import org.json.JSONObject;
import xsna.cqm0;
import xsna.epx;
import xsna.er;

/* compiled from: ActionOpenModal.kt */
/* loaded from: classes18.dex */
public final class ActionOpenModal extends HeaderAction {
    public static final Serializer.c<ActionOpenModal> CREATOR = new a();
    public final ModalImage b;
    public final OverlayImage c;
    public final String d;
    public final Text e;
    public final ModalButton f;

    /* compiled from: ActionOpenModal.kt */
    public static final class ModalButton implements Serializer.StreamParcelable {
        public static final Serializer.c<ModalButton> CREATOR = new b();
        public final Text b;
        public final HeaderAction c;
        public final ThemedColor d;

        /* compiled from: ActionOpenModal.kt */
        public static final class a {
            public static ModalButton a(JSONObject jSONObject, Map map) {
                Text text;
                JSONObject optJSONObject = jSONObject.optJSONObject("text");
                ThemedColor themedColor = null;
                if (optJSONObject != null) {
                    Serializer.c<Text> cVar = Text.CREATOR;
                    text = Text.a.a(optJSONObject);
                } else {
                    text = null;
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("action");
                HeaderAction a = optJSONObject2 != null ? HeaderAction.a.a(optJSONObject2, map) : null;
                JSONObject optJSONObject3 = jSONObject.optJSONObject("background_color");
                if (optJSONObject3 != null) {
                    String a2 = cqm0.a(optJSONObject3.optString("light"));
                    Integer a3 = a2 != null ? n.a("#", a2) : null;
                    String a4 = cqm0.a(optJSONObject3.optString("dark"));
                    themedColor = new ThemedColor(a3, a4 != null ? n.a("#", a4) : null);
                }
                return new ModalButton(text, a, themedColor);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<ModalButton> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ModalButton a(Serializer serializer) {
                return new ModalButton((Text) serializer.G(Text.class.getClassLoader()), (HeaderAction) serializer.G(HeaderAction.class.getClassLoader()), (ThemedColor) serializer.G(ThemedColor.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ModalButton[i];
            }
        }

        public ModalButton(Text text, HeaderAction headerAction, ThemedColor themedColor) {
            this.b = text;
            this.c = headerAction;
            this.d = themedColor;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            serializer.i0(this.c);
            serializer.i0(this.d);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: ActionOpenModal.kt */
    public static final class ModalImage implements Serializer.StreamParcelable {
        public static final Serializer.c<ModalImage> CREATOR = new a();
        public final String b;
        public final Image c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<ModalImage> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ModalImage a(Serializer serializer) {
                return new ModalImage(serializer.H(), (Image) serializer.G(Image.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ModalImage[i];
            }
        }

        public ModalImage(String str, Image image) {
            this.b = str;
            this.c = image;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.i0(this.c);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModalImage)) {
                return false;
            }
            ModalImage modalImage = (ModalImage) obj;
            return epx.f(this.b, modalImage.b) && epx.f(this.c, modalImage.c);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Image image = this.c;
            return hashCode + (image != null ? image.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ModalImage(imageUrl=");
            sb.append(this.b);
            sb.append(", image=");
            return er.d(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: ActionOpenModal.kt */
    public static final class OverlayImage implements Serializer.StreamParcelable {
        public static final Serializer.c<OverlayImage> CREATOR = new a();
        public final String b;
        public final String c;
        public final Image d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<OverlayImage> {
            @Override // com.vk.core.serialize.Serializer.c
            public final OverlayImage a(Serializer serializer) {
                return new OverlayImage(serializer.H(), serializer.H(), (Image) serializer.G(Image.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OverlayImage[i];
            }
        }

        public OverlayImage(String str, String str2, Image image) {
            this.b = str;
            this.c = str2;
            this.d = image;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.i0(this.d);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OverlayImage)) {
                return false;
            }
            OverlayImage overlayImage = (OverlayImage) obj;
            return epx.f(this.b, overlayImage.b) && epx.f(this.c, overlayImage.c) && epx.f(this.d, overlayImage.d);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Image image = this.d;
            return hashCode2 + (image != null ? image.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OverlayImage(name=");
            sb.append(this.b);
            sb.append(", imageUrl=");
            sb.append(this.c);
            sb.append(", image=");
            return er.d(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionOpenModal> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionOpenModal a(Serializer serializer) {
            return new ActionOpenModal((ModalImage) serializer.G(ModalImage.class.getClassLoader()), (OverlayImage) serializer.G(OverlayImage.class.getClassLoader()), serializer.H(), (Text) serializer.G(Text.class.getClassLoader()), (ModalButton) serializer.G(ModalButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionOpenModal[i];
        }
    }

    public ActionOpenModal(ModalImage modalImage, OverlayImage overlayImage, String str, Text text, ModalButton modalButton) {
        this.b = modalImage;
        this.c = overlayImage;
        this.d = str;
        this.e = text;
        this.f = modalButton;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionOpenModal)) {
            return false;
        }
        ActionOpenModal actionOpenModal = (ActionOpenModal) obj;
        return epx.f(this.b, actionOpenModal.b) && epx.f(this.c, actionOpenModal.c) && epx.f(this.d, actionOpenModal.d) && epx.f(this.e, actionOpenModal.e) && epx.f(this.f, actionOpenModal.f);
    }

    public final int hashCode() {
        ModalImage modalImage = this.b;
        int hashCode = (modalImage == null ? 0 : modalImage.hashCode()) * 31;
        OverlayImage overlayImage = this.c;
        int hashCode2 = (hashCode + (overlayImage == null ? 0 : overlayImage.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Text text = this.e;
        int hashCode4 = (hashCode3 + (text == null ? 0 : text.hashCode())) * 31;
        ModalButton modalButton = this.f;
        return hashCode4 + (modalButton != null ? modalButton.hashCode() : 0);
    }

    public final String toString() {
        return "ActionOpenModal(image=" + this.b + ", overlayImage=" + this.c + ", title=" + this.d + ", text=" + this.e + ", button=" + this.f + ')';
    }
}
