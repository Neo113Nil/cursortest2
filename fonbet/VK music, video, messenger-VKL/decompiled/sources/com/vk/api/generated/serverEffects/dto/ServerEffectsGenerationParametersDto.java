package com.vk.api.generated.serverEffects.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ServerEffectsGenerationParametersDto.kt */
/* loaded from: classes15.dex */
public final class ServerEffectsGenerationParametersDto implements Parcelable {
    public static final Parcelable.Creator<ServerEffectsGenerationParametersDto> CREATOR = new a();

    @pmi0("cut_fragment")
    private final List<ServerEffectsGenerationParametersCutFragmentDto> cutFragment;

    @pmi0("deepfake_model")
    private final String deepfakeModel;

    @pmi0("smart_crop")
    private final Boolean smartCrop;

    /* compiled from: ServerEffectsGenerationParametersDto.kt */
    public static final class a implements Parcelable.Creator<ServerEffectsGenerationParametersDto> {
        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGenerationParametersDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(ServerEffectsGenerationParametersCutFragmentDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ServerEffectsGenerationParametersDto(readString, arrayList, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGenerationParametersDto[] newArray(int i) {
            return new ServerEffectsGenerationParametersDto[i];
        }
    }

    public ServerEffectsGenerationParametersDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerEffectsGenerationParametersDto)) {
            return false;
        }
        ServerEffectsGenerationParametersDto serverEffectsGenerationParametersDto = (ServerEffectsGenerationParametersDto) obj;
        return epx.f(this.deepfakeModel, serverEffectsGenerationParametersDto.deepfakeModel) && epx.f(this.cutFragment, serverEffectsGenerationParametersDto.cutFragment) && epx.f(this.smartCrop, serverEffectsGenerationParametersDto.smartCrop);
    }

    public final int hashCode() {
        String str = this.deepfakeModel;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ServerEffectsGenerationParametersCutFragmentDto> list = this.cutFragment;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.smartCrop;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerEffectsGenerationParametersDto(deepfakeModel=");
        sb.append(this.deepfakeModel);
        sb.append(", cutFragment=");
        sb.append(this.cutFragment);
        sb.append(", smartCrop=");
        return tn.a(sb, this.smartCrop, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.deepfakeModel);
        List<ServerEffectsGenerationParametersCutFragmentDto> list = this.cutFragment;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((ServerEffectsGenerationParametersCutFragmentDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.smartCrop;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public ServerEffectsGenerationParametersDto(String str, List<ServerEffectsGenerationParametersCutFragmentDto> list, Boolean bool) {
        this.deepfakeModel = str;
        this.cutFragment = list;
        this.smartCrop = bool;
    }

    public /* synthetic */ ServerEffectsGenerationParametersDto(String str, List list, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : bool);
    }
}
