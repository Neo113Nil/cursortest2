package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.StreamKey;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.internal.ads.zzp;
import com.google.android.gms.internal.ads.zzq;
import com.google.android.play.core.hsdp.protocol.PrewarmRequest;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.Timer;
import com.sofascore.model.TvType;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import com.sofascore.results.event.details.view.tv.model.TvChannelData;
import com.sofascore.results.league.fragment.details.compose.model.TeamOfTheWeekFieldUIData;
import com.sofascore.results.league.fragment.details.compose.model.TeamOfTheWeekPlayerUIData;
import com.sofascore.results.league.fragment.details.compose.totr.share.TotrSharePayload;
import com.sofascore.results.league.fragment.topStats.TopPerformanceCategoryUiModel;
import com.sofascore.results.league.fragment.topStats.TopPlayerCategoryUiModel;
import com.sofascore.results.league.fragment.topStats.TopTeamCategoryUiModel;
import com.sofascore.results.subscription.SubscriptionPriceBundle;
import com.sofascore.results.wc26.data.WorldCupLastDanceUiModel;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dyh implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ dyh(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Double d;
        boolean z;
        int i = 0;
        switch (this.a) {
            case 0:
                return new SpliceNullCommand();
            case 1:
                return new SpliceScheduleCommand(parcel);
            case 2:
                return new StreamKey(parcel);
            case 3:
                parcel.getClass();
                return new SubscriptionPriceBundle(parcel.readString(), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : cu.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : iyf.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : iyf.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString());
            case 4:
                parcel.getClass();
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (i != readInt) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                    i++;
                }
                b7 Z = l6g.Z(arrayList);
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(TeamOfTheWeekPlayerUIData.CREATOR.createFromParcel(parcel));
                }
                return new TeamOfTheWeekFieldUIData(Z, l6g.Z(arrayList2), readString);
            case 5:
                parcel.getClass();
                int readInt3 = parcel.readInt();
                String readString2 = parcel.readString();
                int readInt4 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                    d = null;
                } else {
                    d = null;
                    z = false;
                }
                return new TeamOfTheWeekPlayerUIData(readInt3, readString2, readInt4, z, parcel.readInt() == 0 ? d : Double.valueOf(parcel.readDouble()));
            case 6:
                return new TextInformationFrame(parcel);
            case 7:
                return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
            case 8:
                return new Timer(parcel.readLong(), parcel.readLong());
            case 9:
                parcel.getClass();
                String readString3 = parcel.readString();
                int readInt5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt5);
                for (int i3 = 0; i3 != readInt5; i3++) {
                    arrayList3.add(parcel.readSerializable());
                }
                return new TopPerformanceCategoryUiModel(readString3, l6g.Z(arrayList3), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 10:
                parcel.getClass();
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt6);
                for (int i4 = 0; i4 != readInt6; i4++) {
                    arrayList4.add(parcel.readSerializable());
                }
                return new TopPlayerCategoryUiModel(readString4, l6g.Z(arrayList4), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 11:
                parcel.getClass();
                String readString5 = parcel.readString();
                int readInt7 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt7);
                for (int i5 = 0; i5 != readInt7; i5++) {
                    arrayList5.add(parcel.readSerializable());
                }
                return new TopTeamCategoryUiModel(readString5, l6g.Z(arrayList5), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, TeamAverageRatingVersion.valueOf(parcel.readString()));
            case 12:
                parcel.getClass();
                return new TotrSharePayload(TeamOfTheWeekFieldUIData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
            case 13:
                return new Trace(parcel, false);
            case 14:
                parcel.getClass();
                return new TvChannelData(parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.createStringArrayList(), TvType.valueOf(parcel.readString()));
            case 15:
                return new UrlLinkFrame(parcel);
            case 16:
                return new VorbisComment(parcel);
            case 17:
                return new com.google.android.exoplayer2.metadata.flac.VorbisComment(parcel);
            case 18:
                parcel.getClass();
                return new WorldCupLastDanceUiModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 19:
                return new WrappedParcelable(parcel);
            case 20:
                return new zzd(parcel.readStrongBinder());
            case 21:
                try {
                    return UserVerificationRequirement.a(parcel.readString());
                } catch (zzbc e) {
                    is8.h(e);
                    return null;
                }
            case 22:
                int readInt8 = parcel.readInt();
                ErrorCode[] values = ErrorCode.values();
                int length = values.length;
                while (i < length) {
                    ErrorCode errorCode = values[i];
                    if (readInt8 == errorCode.a) {
                        return errorCode;
                    }
                    i++;
                }
                return ErrorCode.b;
            case 23:
                return new BinderWrapper(parcel);
            case 24:
                return new PrewarmRequest(parcel);
            case 25:
                return new zzq(parcel);
            default:
                return new zzp(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new SpliceNullCommand[i];
            case 1:
                return new SpliceScheduleCommand[i];
            case 2:
                return new StreamKey[i];
            case 3:
                return new SubscriptionPriceBundle[i];
            case 4:
                return new TeamOfTheWeekFieldUIData[i];
            case 5:
                return new TeamOfTheWeekPlayerUIData[i];
            case 6:
                return new TextInformationFrame[i];
            case 7:
                return new TimeSignalCommand[i];
            case 8:
                return new Timer[i];
            case 9:
                return new TopPerformanceCategoryUiModel[i];
            case 10:
                return new TopPlayerCategoryUiModel[i];
            case 11:
                return new TopTeamCategoryUiModel[i];
            case 12:
                return new TotrSharePayload[i];
            case 13:
                return new Trace[i];
            case 14:
                return new TvChannelData[i];
            case 15:
                return new UrlLinkFrame[i];
            case 16:
                return new VorbisComment[i];
            case 17:
                return new com.google.android.exoplayer2.metadata.flac.VorbisComment[i];
            case 18:
                return new WorldCupLastDanceUiModel[i];
            case 19:
                return new WrappedParcelable[i];
            case 20:
                return new zzd[i];
            case 21:
                return new UserVerificationRequirement[i];
            case 22:
                return new ErrorCode[i];
            case 23:
                return new BinderWrapper[i];
            case 24:
                return new PrewarmRequest[i];
            case 25:
                return new zzq[i];
            default:
                return new zzp[i];
        }
    }
}
