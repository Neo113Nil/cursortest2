package com.vk.clips.editor.templates.impl.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.dto.common.ClipVideoFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;

/* compiled from: ClipsVideoTemplateEditorInputModel.kt */
/* loaded from: classes16.dex */
public final class ClipsVideoTemplateEditorInputModel implements Parcelable {
    public static final Parcelable.Creator<ClipsVideoTemplateEditorInputModel> CREATOR = new a();
    public final String b;
    public final ClipVideoFile c;
    public final ShortVideoGetTemplateExtendedResponseDto d;
    public final List<ClipsTemplatesInputVideoItem> e;
    public final String f;
    public final boolean g;

    /* compiled from: ClipsVideoTemplateEditorInputModel.kt */
    public static final class a implements Parcelable.Creator<ClipsVideoTemplateEditorInputModel> {
        @Override // android.os.Parcelable.Creator
        public final ClipsVideoTemplateEditorInputModel createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            ClipVideoFile clipVideoFile = (ClipVideoFile) parcel.readParcelable(ClipsVideoTemplateEditorInputModel.class.getClassLoader());
            ShortVideoGetTemplateExtendedResponseDto shortVideoGetTemplateExtendedResponseDto = (ShortVideoGetTemplateExtendedResponseDto) parcel.readParcelable(ClipsVideoTemplateEditorInputModel.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ClipsTemplatesInputVideoItem.CREATOR, parcel, arrayList, i, 1);
            }
            return new ClipsVideoTemplateEditorInputModel(readString, clipVideoFile, shortVideoGetTemplateExtendedResponseDto, arrayList, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsVideoTemplateEditorInputModel[] newArray(int i) {
            return new ClipsVideoTemplateEditorInputModel[i];
        }
    }

    public ClipsVideoTemplateEditorInputModel(String str, ClipVideoFile clipVideoFile, ShortVideoGetTemplateExtendedResponseDto shortVideoGetTemplateExtendedResponseDto, List<ClipsTemplatesInputVideoItem> list, String str2, boolean z) {
        this.b = str;
        this.c = clipVideoFile;
        this.d = shortVideoGetTemplateExtendedResponseDto;
        this.e = list;
        this.f = str2;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        Iterator a2 = ao.a(parcel, this.e);
        while (a2.hasNext()) {
            ((ClipsTemplatesInputVideoItem) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
