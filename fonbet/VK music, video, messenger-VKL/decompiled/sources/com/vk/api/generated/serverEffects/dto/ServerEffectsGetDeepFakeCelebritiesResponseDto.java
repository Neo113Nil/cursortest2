package com.vk.api.generated.serverEffects.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ServerEffectsGetDeepFakeCelebritiesResponseDto.kt */
/* loaded from: classes15.dex */
public final class ServerEffectsGetDeepFakeCelebritiesResponseDto implements Parcelable {
    public static final Parcelable.Creator<ServerEffectsGetDeepFakeCelebritiesResponseDto> CREATOR = new a();

    @pmi0("celebrities")
    private final List<ServerEffectsDeepFakeCelebrityDto> celebrities;

    /* compiled from: ServerEffectsGetDeepFakeCelebritiesResponseDto.kt */
    public static final class a implements Parcelable.Creator<ServerEffectsGetDeepFakeCelebritiesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGetDeepFakeCelebritiesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ServerEffectsDeepFakeCelebrityDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ServerEffectsGetDeepFakeCelebritiesResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGetDeepFakeCelebritiesResponseDto[] newArray(int i) {
            return new ServerEffectsGetDeepFakeCelebritiesResponseDto[i];
        }
    }

    public ServerEffectsGetDeepFakeCelebritiesResponseDto(List<ServerEffectsDeepFakeCelebrityDto> list) {
        this.celebrities = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServerEffectsGetDeepFakeCelebritiesResponseDto) && epx.f(this.celebrities, ((ServerEffectsGetDeepFakeCelebritiesResponseDto) obj).celebrities);
    }

    public final int hashCode() {
        return this.celebrities.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ServerEffectsGetDeepFakeCelebritiesResponseDto(celebrities="), this.celebrities);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.celebrities);
        while (a2.hasNext()) {
            ((ServerEffectsDeepFakeCelebrityDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
