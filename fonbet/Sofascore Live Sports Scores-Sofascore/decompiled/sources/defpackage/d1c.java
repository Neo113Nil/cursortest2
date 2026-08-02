package defpackage;

import android.media.MediaDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.os.ResultReceiver;
import androidx.paging.compose.PagingPlaceholderKey;
import androidx.versionedparcelable.ParcelImpl;
import coil.memory.MemoryCache$Key;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.perf.session.PerfSession;
import com.sofascore.results.dialog.SettingsItem;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.sofascore.results.feed.compose.model.ShortVideoFeedCardModel;
import com.sofascore.results.onboarding.follow.model.OnboardingItemAdditionalIcon;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import defpackage.d1c;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d1c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ d1c(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [an9] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        zm9 zm9Var;
        Bundle bundle = null;
        switch (this.a) {
            case 0:
                return new MdtaMetadataEntry(parcel);
            case 1:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new d1c(1);
                    public final int a;
                    public final MediaDescriptionCompat b;

                    {
                        this.a = parcel.readInt();
                        this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.a);
                        this.b.writeToParcel(parcel2, i);
                    }
                };
            case 2:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            case 3:
                return new MediaMetadataCompat(parcel);
            case 4:
                return new MediaSessionCompat$QueueItem(parcel);
            case 5:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 6:
                String readString = parcel.readString();
                readString.getClass();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i < readInt; i++) {
                    String readString2 = parcel.readString();
                    readString2.getClass();
                    String readString3 = parcel.readString();
                    readString3.getClass();
                    linkedHashMap.put(readString2, readString3);
                }
                return new MemoryCache$Key(readString, linkedHashMap);
            case 7:
                return new Metadata(parcel);
            case 8:
                return new MlltFrame(parcel);
            case 9:
                return new MotionPhotoMetadata(parcel);
            case 10:
                parcel.getClass();
                return new OddsEventUIModel(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 11:
                parcel.getClass();
                return new OnboardingItemUiModel(parcel.readInt(), srd.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (OnboardingItemAdditionalIcon) parcel.readParcelable(OnboardingItemUiModel.class.getClassLoader()), (OnboardingItemAdditionalIcon) parcel.readParcelable(OnboardingItemUiModel.class.getClassLoader()));
            case 12:
                return new PagingPlaceholderKey(parcel.readInt());
            case 13:
                return new ParcelImpl(parcel);
            case 14:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.a = parcel.readInt();
                parcelableVolumeInfo.c = parcel.readInt();
                parcelableVolumeInfo.d = parcel.readInt();
                parcelableVolumeInfo.e = parcel.readInt();
                parcelableVolumeInfo.b = parcel.readInt();
                return parcelableVolumeInfo;
            case 15:
                return new PerfSession(parcel);
            case 16:
                return new PictureFrame(parcel);
            case 17:
                return new PlaybackStateCompat(parcel);
            case 18:
                return new PrivFrame(parcel);
            case 19:
                return new PrivateCommand(parcel);
            case 20:
                parcel.getClass();
                return new RaceFlowModels$RaceEntrant(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RaceFlowModels$RaceTeam.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0);
            case 21:
                parcel.getClass();
                return new RaceFlowModels$RaceTeam(parcel.readInt(), parcel.readString(), parcel.readInt());
            case 22:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 23:
                int B = SafeParcelReader.B(parcel);
                while (parcel.dataPosition() < B) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 2) {
                        SafeParcelReader.A(parcel, readInt2);
                    } else {
                        bundle = SafeParcelReader.b(parcel, readInt2);
                    }
                }
                SafeParcelReader.n(parcel, B);
                return new RemoteMessage(bundle);
            case 24:
                ResultReceiver resultReceiver = new ResultReceiver();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i2 = z2g.b;
                if (readStrongBinder == null) {
                    zm9Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(an9.w7);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof an9)) {
                        zm9 zm9Var2 = new zm9();
                        zm9Var2.a = readStrongBinder;
                        zm9Var = zm9Var2;
                    } else {
                        zm9Var = (an9) queryLocalInterface;
                    }
                }
                resultReceiver.a = zm9Var;
                return resultReceiver;
            case 25:
                parcel.getClass();
                return new SettingsItem(parcel.readString(), parcel.readString());
            case 26:
                parcel.getClass();
                return new ShortVideoFeedCardModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() != 0);
            case 27:
                SingleDateSelector singleDateSelector = new SingleDateSelector();
                singleDateSelector.a = (Long) parcel.readValue(Long.class.getClassLoader());
                return singleDateSelector;
            case 28:
                return new SmtaMetadataEntry(parcel);
            default:
                return new SpliceInsertCommand(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new MdtaMetadataEntry[i];
            case 1:
                return new MediaBrowserCompat$MediaItem[i];
            case 2:
                return new MediaDescriptionCompat[i];
            case 3:
                return new MediaMetadataCompat[i];
            case 4:
                return new MediaSessionCompat$QueueItem[i];
            case 5:
                return new MediaSessionCompat$Token[i];
            case 6:
                return new MemoryCache$Key[i];
            case 7:
                return new Metadata[i];
            case 8:
                return new MlltFrame[i];
            case 9:
                return new MotionPhotoMetadata[i];
            case 10:
                return new OddsEventUIModel[i];
            case 11:
                return new OnboardingItemUiModel[i];
            case 12:
                return new PagingPlaceholderKey[i];
            case 13:
                return new ParcelImpl[i];
            case 14:
                return new ParcelableVolumeInfo[i];
            case 15:
                return new PerfSession[i];
            case 16:
                return new PictureFrame[i];
            case 17:
                return new PlaybackStateCompat[i];
            case 18:
                return new PrivFrame[i];
            case 19:
                return new PrivateCommand[i];
            case 20:
                return new RaceFlowModels$RaceEntrant[i];
            case 21:
                return new RaceFlowModels$RaceTeam[i];
            case 22:
                return new RatingCompat[i];
            case 23:
                return new RemoteMessage[i];
            case 24:
                return new ResultReceiver[i];
            case 25:
                return new SettingsItem[i];
            case 26:
                return new ShortVideoFeedCardModel[i];
            case 27:
                return new SingleDateSelector[i];
            case 28:
                return new SmtaMetadataEntry[i];
            default:
                return new SpliceInsertCommand[i];
        }
    }
}
