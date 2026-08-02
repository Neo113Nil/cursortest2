package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.firebase.perf.metrics.Counter;
import com.sofascore.results.fantasy.shared.FantasyRoundPlayerInfo;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayer;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayers;
import com.sofascore.results.fantasy.ui.components.FantasyLeaderboardStatistic;
import com.sofascore.results.fantasy.ui.model.BasicTournamentInfo;
import com.sofascore.results.fantasy.ui.model.FantasyFootballPlayerPlaceholder;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureData;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingData;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.feed.compose.model.FeedbackType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wd implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ wd(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new ActivityResult(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                return new ApicFrame(parcel);
            case 2:
                String readString = parcel.readString();
                readString.getClass();
                return new AppInfoTable(parcel.readInt(), readString);
            case 3:
                BadgeState$State badgeState$State = new BadgeState$State();
                badgeState$State.i = 255;
                badgeState$State.k = -2;
                badgeState$State.l = -2;
                badgeState$State.m = -2;
                badgeState$State.t = Boolean.TRUE;
                badgeState$State.a = parcel.readInt();
                badgeState$State.b = (Integer) parcel.readSerializable();
                badgeState$State.c = (Integer) parcel.readSerializable();
                badgeState$State.d = (Integer) parcel.readSerializable();
                badgeState$State.e = (Integer) parcel.readSerializable();
                badgeState$State.f = (Integer) parcel.readSerializable();
                badgeState$State.g = (Integer) parcel.readSerializable();
                badgeState$State.h = (Integer) parcel.readSerializable();
                badgeState$State.i = parcel.readInt();
                badgeState$State.j = parcel.readString();
                badgeState$State.k = parcel.readInt();
                badgeState$State.l = parcel.readInt();
                badgeState$State.m = parcel.readInt();
                badgeState$State.o = parcel.readString();
                badgeState$State.p = parcel.readString();
                badgeState$State.q = parcel.readInt();
                badgeState$State.s = (Integer) parcel.readSerializable();
                badgeState$State.u = (Integer) parcel.readSerializable();
                badgeState$State.v = (Integer) parcel.readSerializable();
                badgeState$State.w = (Integer) parcel.readSerializable();
                badgeState$State.x = (Integer) parcel.readSerializable();
                badgeState$State.y = (Integer) parcel.readSerializable();
                badgeState$State.z = (Integer) parcel.readSerializable();
                badgeState$State.C = (Integer) parcel.readSerializable();
                badgeState$State.A = (Integer) parcel.readSerializable();
                badgeState$State.B = (Integer) parcel.readSerializable();
                badgeState$State.t = (Boolean) parcel.readSerializable();
                badgeState$State.n = (Locale) parcel.readSerializable();
                badgeState$State.D = (Boolean) parcel.readSerializable();
                badgeState$State.E = (Integer) parcel.readSerializable();
                return badgeState$State;
            case 4:
                parcel.getClass();
                return new BasicTournamentInfo(parcel.readInt(), parcel.readString(), parcel.readInt());
            case 5:
                return new BinaryFrame(parcel);
            case 6:
                return new ChapterFrame(parcel);
            case 7:
                return new ChapterTocFrame(parcel);
            case 8:
                return new CommentFrame(parcel);
            case 9:
                return new Counter(parcel);
            case 10:
                return new DateValidatorPointForward(parcel.readLong());
            case 11:
                return new DrmInitData(parcel);
            case 12:
                return new androidx.media3.common.DrmInitData(parcel);
            case 13:
                return new EventMessage(parcel);
            case 14:
                parcel.getClass();
                return new FantasyFootballPlayerPlaceholder(rz6.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : yy6.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
            case 15:
                parcel.getClass();
                return FantasyLeaderboardStatistic.valueOf(parcel.readString());
            case 16:
                parcel.getClass();
                return new FantasyPlayerFixtureData(parcel.readInt() == 0 ? null : sd7.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : rd7.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ad7.valueOf(parcel.readString()));
            case 17:
                parcel.getClass();
                return new FantasyPlayerFixtureUiModel(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : p68.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : o68.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : sd7.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : rd7.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ad7.valueOf(parcel.readString()));
            case 18:
                parcel.getClass();
                return new FantasyPlayerMissingData(sd7.valueOf(parcel.readString()), rd7.valueOf(parcel.readString()), parcel.readString());
            case 19:
                parcel.getClass();
                return new FantasyPlayerUiModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), rz6.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 20:
                parcel.getClass();
                return new FantasyRoundPlayerInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FantasyPlayerFixtureUiModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FantasyPlayerFixtureUiModel.CREATOR.createFromParcel(parcel));
            case 21:
                parcel.getClass();
                int readInt = parcel.readInt();
                rz6 valueOf = rz6.valueOf(parcel.readString());
                yy6 valueOf2 = parcel.readInt() == 0 ? null : yy6.valueOf(parcel.readString());
                int readInt2 = parcel.readInt();
                boolean z = parcel.readInt() != 0;
                int readInt3 = parcel.readInt();
                FantasyPlayerUiModel createFromParcel = FantasyPlayerUiModel.CREATOR.createFromParcel(parcel);
                int readInt4 = parcel.readInt();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                FantasyPlayerMissingData createFromParcel2 = parcel.readInt() == 0 ? null : FantasyPlayerMissingData.CREATOR.createFromParcel(parcel);
                boolean z3 = parcel.readInt() != 0;
                Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString4 = parcel.readString();
                Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Float valueOf7 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                Float valueOf8 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                Float valueOf9 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                int readInt5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt5);
                for (int i = 0; i != readInt5; i++) {
                    arrayList2.add(FantasyPlayerFixtureUiModel.CREATOR.createFromParcel(parcel));
                }
                int readInt6 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt6);
                int i2 = 0;
                while (i2 != readInt6) {
                    linkedHashMap.put(Integer.valueOf(parcel.readInt()), FantasyPlayerFixtureData.CREATOR.createFromParcel(parcel));
                    i2++;
                    readInt6 = readInt6;
                }
                boolean z6 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt7 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt7);
                    for (int i3 = 0; i3 != readInt7; i3++) {
                        arrayList3.add(Float.valueOf(parcel.readFloat()));
                    }
                    arrayList = arrayList3;
                }
                return new FantasyRoundPlayerUiModel(readInt, valueOf, valueOf2, readInt2, z, readInt3, createFromParcel, readInt4, readString2, readString3, z2, createFromParcel2, z3, valueOf3, readString4, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, z4, z5, arrayList2, linkedHashMap, z6, arrayList, parcel.readInt() == 0 ? null : BasicTournamentInfo.CREATOR.createFromParcel(parcel), FantasyRoundPlayerInfo.CREATOR.createFromParcel(parcel));
            case 22:
                parcel.getClass();
                return new FantasyTransferPlayer(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readFloat(), rz6.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
            case 23:
                parcel.getClass();
                Parcelable.Creator<FantasyTransferPlayer> creator = FantasyTransferPlayer.CREATOR;
                return new FantasyTransferPlayers(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            case 24:
                parcel.getClass();
                return new FeedbackType(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            case 25:
                return new GeobFrame(parcel);
            case 26:
                return new IcyHeaders(parcel);
            case 27:
                return new IcyInfo(parcel);
            case 28:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new IntentSenderRequest((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            default:
                return new InternalFrame(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ActivityResult[i];
            case 1:
                return new ApicFrame[i];
            case 2:
                return new AppInfoTable[i];
            case 3:
                return new BadgeState$State[i];
            case 4:
                return new BasicTournamentInfo[i];
            case 5:
                return new BinaryFrame[i];
            case 6:
                return new ChapterFrame[i];
            case 7:
                return new ChapterTocFrame[i];
            case 8:
                return new CommentFrame[i];
            case 9:
                return new Counter[i];
            case 10:
                return new DateValidatorPointForward[i];
            case 11:
                return new DrmInitData[i];
            case 12:
                return new androidx.media3.common.DrmInitData[i];
            case 13:
                return new EventMessage[i];
            case 14:
                return new FantasyFootballPlayerPlaceholder[i];
            case 15:
                return new FantasyLeaderboardStatistic[i];
            case 16:
                return new FantasyPlayerFixtureData[i];
            case 17:
                return new FantasyPlayerFixtureUiModel[i];
            case 18:
                return new FantasyPlayerMissingData[i];
            case 19:
                return new FantasyPlayerUiModel[i];
            case 20:
                return new FantasyRoundPlayerInfo[i];
            case 21:
                return new FantasyRoundPlayerUiModel[i];
            case 22:
                return new FantasyTransferPlayer[i];
            case 23:
                return new FantasyTransferPlayers[i];
            case 24:
                return new FeedbackType[i];
            case 25:
                return new GeobFrame[i];
            case 26:
                return new IcyHeaders[i];
            case 27:
                return new IcyInfo[i];
            case 28:
                return new IntentSenderRequest[i];
            default:
                return new InternalFrame[i];
        }
    }
}
