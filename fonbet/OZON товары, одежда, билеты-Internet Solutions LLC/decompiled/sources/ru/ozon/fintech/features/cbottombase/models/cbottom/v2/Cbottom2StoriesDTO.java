package ru.ozon.fintech.features.cbottombase.models.cbottom.v2;

import B0.C2454a;
import B90.C2616s;
import B90.C2618u;
import Bi.b;
import C.J;
import D40.c;
import De.C2860c;
import N3.C3660k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003>?@BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b$\u0010%J`\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b(\u0010\u001bJ\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u001a\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b6\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010#R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010%R\u001c\u0010=\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010%¨\u0006A"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2StoriesDTO;", "Landroid/os/Parcelable;", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/a;", "", "id", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "type", "", "version", "selectedStory", "selectedFrame", "", "canClose", "", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2StoriesDTO$StoryDTO;", "stories", "<init>", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;Ljava/lang/Integer;IILjava/lang/Boolean;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;Ljava/lang/Integer;IILjava/lang/Boolean;Ljava/util/List;)Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2StoriesDTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "getType", "Ljava/lang/Integer;", "getVersion", "I", "getSelectedStory", "getSelectedFrame", "Ljava/lang/Boolean;", "getCanClose", "Ljava/util/List;", "getStories", "LF40/a;", "getAllWidgets", "allWidgets", "PreviewDTO", "FrameDTO", "StoryDTO", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Cbottom2StoriesDTO implements Parcelable, ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a {

    @NotNull
    public static final Parcelable.Creator<Cbottom2StoriesDTO> CREATOR = new a();

    @i(name = "canClose")
    private final Boolean canClose;

    @i(name = "id")
    @NotNull
    private final String id;

    @i(name = "selectedFrame")
    private final int selectedFrame;

    @i(name = "selectedStory")
    private final int selectedStory;

    @i(name = "stories")
    @NotNull
    private final List<StoryDTO> stories;

    @i(name = "type")
    @NotNull
    private final CbottomType type;

    @i(name = "version")
    private final Integer version;

    @Keep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010%J\u008e\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001cJ\u0010\u0010+\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u001a\u0010.\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010#R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010%R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b;\u0010%R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b<\u0010%¨\u0006="}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2StoriesDTO$FrameDTO;", "Landroid/os/Parcelable;", "", "id", "videoUrl", "imageUrl", "background", "", "duration", "", "autoplay", "", "LF40/a;", "topWidgets", "bottomWidgets", "centerWidgets", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Long;", "component6", "()Ljava/lang/Boolean;", "component7", "()Ljava/util/List;", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2StoriesDTO$FrameDTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getVideoUrl", "getImageUrl", "getBackground", "Ljava/lang/Long;", "getDuration", "Ljava/lang/Boolean;", "getAutoplay", "Ljava/util/List;", "getTopWidgets", "getBottomWidgets", "getCenterWidgets", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class FrameDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FrameDTO> CREATOR = new a();

        @i(name = "autoplay")
        private final Boolean autoplay;

        @i(name = "background")
        private final String background;

        @i(name = "bottomWidgets")
        private final List<F40.a> bottomWidgets;

        @i(name = "centerWidgets")
        private final List<F40.a> centerWidgets;

        @i(name = "duration")
        private final Long duration;

        @i(name = "id")
        private final String id;

        @i(name = "imageUrl")
        private final String imageUrl;

        @i(name = "topWidgets")
        private final List<F40.a> topWidgets;

        @i(name = "videoUrl")
        private final String videoUrl;

        public static final class a implements Parcelable.Creator<FrameDTO> {
            @Override // android.os.Parcelable.Creator
            public final FrameDTO createFromParcel(Parcel parcel) {
                Boolean valueOf;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                int i11 = 0;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt);
                    int i12 = 0;
                    while (i12 != readInt) {
                        i12 = b.a(FrameDTO.class, parcel, arrayList4, i12, 1);
                    }
                    arrayList = arrayList4;
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt2);
                    int i13 = 0;
                    while (i13 != readInt2) {
                        i13 = b.a(FrameDTO.class, parcel, arrayList2, i13, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    arrayList3 = new ArrayList(readInt3);
                    while (i11 != readInt3) {
                        i11 = b.a(FrameDTO.class, parcel, arrayList3, i11, 1);
                    }
                }
                return new FrameDTO(readString, readString2, readString3, readString4, valueOf2, valueOf, arrayList, arrayList2, arrayList3);
            }

            @Override // android.os.Parcelable.Creator
            public final FrameDTO[] newArray(int i11) {
                return new FrameDTO[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FrameDTO(String str, String str2, String str3, String str4, Long l11, Boolean bool, List<? extends F40.a> list, List<? extends F40.a> list2, List<? extends F40.a> list3) {
            this.id = str;
            this.videoUrl = str2;
            this.imageUrl = str3;
            this.background = str4;
            this.duration = l11;
            this.autoplay = bool;
            this.topWidgets = list;
            this.bottomWidgets = list2;
            this.centerWidgets = list3;
        }

        public static /* synthetic */ FrameDTO copy$default(FrameDTO frameDTO, String str, String str2, String str3, String str4, Long l11, Boolean bool, List list, List list2, List list3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = frameDTO.id;
            }
            if ((i11 & 2) != 0) {
                str2 = frameDTO.videoUrl;
            }
            if ((i11 & 4) != 0) {
                str3 = frameDTO.imageUrl;
            }
            if ((i11 & 8) != 0) {
                str4 = frameDTO.background;
            }
            if ((i11 & 16) != 0) {
                l11 = frameDTO.duration;
            }
            if ((i11 & 32) != 0) {
                bool = frameDTO.autoplay;
            }
            if ((i11 & 64) != 0) {
                list = frameDTO.topWidgets;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                list2 = frameDTO.bottomWidgets;
            }
            if ((i11 & 256) != 0) {
                list3 = frameDTO.centerWidgets;
            }
            List list4 = list2;
            List list5 = list3;
            Boolean bool2 = bool;
            List list6 = list;
            Long l12 = l11;
            String str5 = str3;
            return frameDTO.copy(str, str2, str5, str4, l12, bool2, list6, list4, list5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVideoUrl() {
            return this.videoUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackground() {
            return this.background;
        }

        /* renamed from: component5, reason: from getter */
        public final Long getDuration() {
            return this.duration;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getAutoplay() {
            return this.autoplay;
        }

        public final List<F40.a> component7() {
            return this.topWidgets;
        }

        public final List<F40.a> component8() {
            return this.bottomWidgets;
        }

        public final List<F40.a> component9() {
            return this.centerWidgets;
        }

        @NotNull
        public final FrameDTO copy(String id2, String videoUrl, String imageUrl, String background, Long duration, Boolean autoplay, List<? extends F40.a> topWidgets, List<? extends F40.a> bottomWidgets, List<? extends F40.a> centerWidgets) {
            return new FrameDTO(id2, videoUrl, imageUrl, background, duration, autoplay, topWidgets, bottomWidgets, centerWidgets);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FrameDTO)) {
                return false;
            }
            FrameDTO frameDTO = (FrameDTO) other;
            return Intrinsics.d(this.id, frameDTO.id) && Intrinsics.d(this.videoUrl, frameDTO.videoUrl) && Intrinsics.d(this.imageUrl, frameDTO.imageUrl) && Intrinsics.d(this.background, frameDTO.background) && Intrinsics.d(this.duration, frameDTO.duration) && Intrinsics.d(this.autoplay, frameDTO.autoplay) && Intrinsics.d(this.topWidgets, frameDTO.topWidgets) && Intrinsics.d(this.bottomWidgets, frameDTO.bottomWidgets) && Intrinsics.d(this.centerWidgets, frameDTO.centerWidgets);
        }

        public final Boolean getAutoplay() {
            return this.autoplay;
        }

        public final String getBackground() {
            return this.background;
        }

        public final List<F40.a> getBottomWidgets() {
            return this.bottomWidgets;
        }

        public final List<F40.a> getCenterWidgets() {
            return this.centerWidgets;
        }

        public final Long getDuration() {
            return this.duration;
        }

        public final String getId() {
            return this.id;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final List<F40.a> getTopWidgets() {
            return this.topWidgets;
        }

        public final String getVideoUrl() {
            return this.videoUrl;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.videoUrl;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.imageUrl;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.background;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l11 = this.duration;
            int hashCode5 = (hashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Boolean bool = this.autoplay;
            int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<F40.a> list = this.topWidgets;
            int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            List<F40.a> list2 = this.bottomWidgets;
            int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<F40.a> list3 = this.centerWidgets;
            return hashCode8 + (list3 != null ? list3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.videoUrl;
            String str3 = this.imageUrl;
            String str4 = this.background;
            Long l11 = this.duration;
            Boolean bool = this.autoplay;
            List<F40.a> list = this.topWidgets;
            List<F40.a> list2 = this.bottomWidgets;
            List<F40.a> list3 = this.centerWidgets;
            StringBuilder d11 = C3660k.d("FrameDTO(id=", str, ", videoUrl=", str2, ", imageUrl=");
            Nh.a.h(d11, str3, ", background=", str4, ", duration=");
            d11.append(l11);
            d11.append(", autoplay=");
            d11.append(bool);
            d11.append(", topWidgets=");
            C2616s.g(", bottomWidgets=", ", centerWidgets=", d11, list, list2);
            return C2618u.h(d11, list3, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.videoUrl);
            dest.writeString(this.imageUrl);
            dest.writeString(this.background);
            Long l11 = this.duration;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l11);
            }
            Boolean bool = this.autoplay;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool);
            }
            List<F40.a> list = this.topWidgets;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator c11 = J.c(dest, 1, list);
                while (c11.hasNext()) {
                    dest.writeParcelable((Parcelable) c11.next(), flags);
                }
            }
            List<F40.a> list2 = this.bottomWidgets;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                Iterator c12 = J.c(dest, 1, list2);
                while (c12.hasNext()) {
                    dest.writeParcelable((Parcelable) c12.next(), flags);
                }
            }
            List<F40.a> list3 = this.centerWidgets;
            if (list3 == null) {
                dest.writeInt(0);
                return;
            }
            Iterator c13 = J.c(dest, 1, list3);
            while (c13.hasNext()) {
                dest.writeParcelable((Parcelable) c13.next(), flags);
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2StoriesDTO$PreviewDTO;", "Landroid/os/Parcelable;", "image", "", "background", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getImage", "()Ljava/lang/String;", "getBackground", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PreviewDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PreviewDTO> CREATOR = new a();

        @i(name = "background")
        private final String background;

        @i(name = "image")
        private final String image;

        @i(name = "text")
        private final TextAtom text;

        public static final class a implements Parcelable.Creator<PreviewDTO> {
            @Override // android.os.Parcelable.Creator
            public final PreviewDTO createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreviewDTO(parcel.readString(), parcel.readString(), (TextAtom) parcel.readParcelable(PreviewDTO.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PreviewDTO[] newArray(int i11) {
                return new PreviewDTO[i11];
            }
        }

        public PreviewDTO(String str, String str2, TextAtom textAtom) {
            this.image = str;
            this.background = str2;
            this.text = textAtom;
        }

        public static /* synthetic */ PreviewDTO copy$default(PreviewDTO previewDTO, String str, String str2, TextAtom textAtom, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = previewDTO.image;
            }
            if ((i11 & 2) != 0) {
                str2 = previewDTO.background;
            }
            if ((i11 & 4) != 0) {
                textAtom = previewDTO.text;
            }
            return previewDTO.copy(str, str2, textAtom);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackground() {
            return this.background;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        @NotNull
        public final PreviewDTO copy(String image, String background, TextAtom text) {
            return new PreviewDTO(image, background, text);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviewDTO)) {
                return false;
            }
            PreviewDTO previewDTO = (PreviewDTO) other;
            return Intrinsics.d(this.image, previewDTO.image) && Intrinsics.d(this.background, previewDTO.background) && Intrinsics.d(this.text, previewDTO.text);
        }

        public final String getBackground() {
            return this.background;
        }

        public final String getImage() {
            return this.image;
        }

        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.image;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.background;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            TextAtom textAtom = this.text;
            return hashCode2 + (textAtom != null ? textAtom.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.background;
            return b.g(C3660k.d("PreviewDTO(image=", str, ", background=", str2, ", text="), this.text, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.image);
            dest.writeString(this.background);
            dest.writeParcelable(this.text, flags);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2StoriesDTO$StoryDTO;", "Landroid/os/Parcelable;", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "preview", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2StoriesDTO$PreviewDTO;", "frames", "", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2StoriesDTO$FrameDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2StoriesDTO$PreviewDTO;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getName", "getPreview", "()Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2StoriesDTO$PreviewDTO;", "getFrames", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class StoryDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StoryDTO> CREATOR = new a();

        @i(name = "frames")
        private final List<FrameDTO> frames;

        @i(name = "id")
        private final String id;

        @i(name = AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String name;

        @i(name = "preview")
        private final PreviewDTO preview;

        public static final class a implements Parcelable.Creator<StoryDTO> {
            @Override // android.os.Parcelable.Creator
            public final StoryDTO createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                ArrayList arrayList = null;
                PreviewDTO createFromParcel = parcel.readInt() == 0 ? null : PreviewDTO.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = Ak.b.b(FrameDTO.CREATOR, parcel, arrayList2, i11, 1);
                    }
                    arrayList = arrayList2;
                }
                return new StoryDTO(readString, readString2, createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final StoryDTO[] newArray(int i11) {
                return new StoryDTO[i11];
            }
        }

        public StoryDTO(String str, String str2, PreviewDTO previewDTO, List<FrameDTO> list) {
            this.id = str;
            this.name = str2;
            this.preview = previewDTO;
            this.frames = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StoryDTO copy$default(StoryDTO storyDTO, String str, String str2, PreviewDTO previewDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = storyDTO.id;
            }
            if ((i11 & 2) != 0) {
                str2 = storyDTO.name;
            }
            if ((i11 & 4) != 0) {
                previewDTO = storyDTO.preview;
            }
            if ((i11 & 8) != 0) {
                list = storyDTO.frames;
            }
            return storyDTO.copy(str, str2, previewDTO, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final PreviewDTO getPreview() {
            return this.preview;
        }

        public final List<FrameDTO> component4() {
            return this.frames;
        }

        @NotNull
        public final StoryDTO copy(String id2, String name, PreviewDTO preview, List<FrameDTO> frames) {
            return new StoryDTO(id2, name, preview, frames);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StoryDTO)) {
                return false;
            }
            StoryDTO storyDTO = (StoryDTO) other;
            return Intrinsics.d(this.id, storyDTO.id) && Intrinsics.d(this.name, storyDTO.name) && Intrinsics.d(this.preview, storyDTO.preview) && Intrinsics.d(this.frames, storyDTO.frames);
        }

        public final List<FrameDTO> getFrames() {
            return this.frames;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final PreviewDTO getPreview() {
            return this.preview;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            PreviewDTO previewDTO = this.preview;
            int hashCode3 = (hashCode2 + (previewDTO == null ? 0 : previewDTO.hashCode())) * 31;
            List<FrameDTO> list = this.frames;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.name;
            PreviewDTO previewDTO = this.preview;
            List<FrameDTO> list = this.frames;
            StringBuilder d11 = C3660k.d("StoryDTO(id=", str, ", name=", str2, ", preview=");
            d11.append(previewDTO);
            d11.append(", frames=");
            d11.append(list);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.name);
            PreviewDTO previewDTO = this.preview;
            if (previewDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                previewDTO.writeToParcel(dest, flags);
            }
            List<FrameDTO> list = this.frames;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                ((FrameDTO) c11.next()).writeToParcel(dest, flags);
            }
        }
    }

    public static final class a implements Parcelable.Creator<Cbottom2StoriesDTO> {
        @Override // android.os.Parcelable.Creator
        public final Cbottom2StoriesDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            CbottomType valueOf = CbottomType.valueOf(parcel.readString());
            Boolean bool = null;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int i11 = 0;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            while (i11 != readInt3) {
                i11 = Ak.b.b(StoryDTO.CREATOR, parcel, arrayList, i11, 1);
            }
            return new Cbottom2StoriesDTO(readString, valueOf, valueOf2, readInt, readInt2, bool, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Cbottom2StoriesDTO[] newArray(int i11) {
            return new Cbottom2StoriesDTO[i11];
        }
    }

    public Cbottom2StoriesDTO(@NotNull String id2, @NotNull CbottomType type, Integer num, int i11, int i12, Boolean bool, @NotNull List<StoryDTO> stories) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(stories, "stories");
        this.id = id2;
        this.type = type;
        this.version = num;
        this.selectedStory = i11;
        this.selectedFrame = i12;
        this.canClose = bool;
        this.stories = stories;
    }

    public static /* synthetic */ Cbottom2StoriesDTO copy$default(Cbottom2StoriesDTO cbottom2StoriesDTO, String str, CbottomType cbottomType, Integer num, int i11, int i12, Boolean bool, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cbottom2StoriesDTO.id;
        }
        if ((i13 & 2) != 0) {
            cbottomType = cbottom2StoriesDTO.type;
        }
        if ((i13 & 4) != 0) {
            num = cbottom2StoriesDTO.version;
        }
        if ((i13 & 8) != 0) {
            i11 = cbottom2StoriesDTO.selectedStory;
        }
        if ((i13 & 16) != 0) {
            i12 = cbottom2StoriesDTO.selectedFrame;
        }
        if ((i13 & 32) != 0) {
            bool = cbottom2StoriesDTO.canClose;
        }
        if ((i13 & 64) != 0) {
            list = cbottom2StoriesDTO.stories;
        }
        Boolean bool2 = bool;
        List list2 = list;
        int i14 = i12;
        Integer num2 = num;
        return cbottom2StoriesDTO.copy(str, cbottomType, num2, i11, i14, bool2, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CbottomType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSelectedStory() {
        return this.selectedStory;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSelectedFrame() {
        return this.selectedFrame;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getCanClose() {
        return this.canClose;
    }

    @NotNull
    public final List<StoryDTO> component7() {
        return this.stories;
    }

    @NotNull
    public final Cbottom2StoriesDTO copy(@NotNull String id2, @NotNull CbottomType type, Integer version, int selectedStory, int selectedFrame, Boolean canClose, @NotNull List<StoryDTO> stories) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(stories, "stories");
        return new Cbottom2StoriesDTO(id2, type, version, selectedStory, selectedFrame, canClose, stories);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cbottom2StoriesDTO)) {
            return false;
        }
        Cbottom2StoriesDTO cbottom2StoriesDTO = (Cbottom2StoriesDTO) other;
        return Intrinsics.d(this.id, cbottom2StoriesDTO.id) && this.type == cbottom2StoriesDTO.type && Intrinsics.d(this.version, cbottom2StoriesDTO.version) && this.selectedStory == cbottom2StoriesDTO.selectedStory && this.selectedFrame == cbottom2StoriesDTO.selectedFrame && Intrinsics.d(this.canClose, cbottom2StoriesDTO.canClose) && Intrinsics.d(this.stories, cbottom2StoriesDTO.stories);
    }

    @Override // B40.a
    public List<F40.a> getAllWidgets() {
        List<StoryDTO> list = this.stories;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<FrameDTO> frames = ((StoryDTO) it.next()).getFrames();
            if (frames == null) {
                frames = K.f71697a;
            }
            C7714v.p(frames, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            FrameDTO frameDTO = (FrameDTO) it2.next();
            List[] elements = {frameDTO.getTopWidgets(), frameDTO.getCenterWidgets(), frameDTO.getBottomWidgets()};
            Intrinsics.checkNotNullParameter(elements, "elements");
            C7714v.p(C7714v.N(C7705l.B(elements)), arrayList2);
        }
        return arrayList2;
    }

    public final Boolean getCanClose() {
        return this.canClose;
    }

    @Override // A40.a
    @NotNull
    public String getId() {
        return this.id;
    }

    public final int getSelectedFrame() {
        return this.selectedFrame;
    }

    public final int getSelectedStory() {
        return this.selectedStory;
    }

    @NotNull
    public final List<StoryDTO> getStories() {
        return this.stories;
    }

    @Override // A40.a
    @NotNull
    public CbottomType getType() {
        return this.type;
    }

    @Override // A40.a
    public Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() + (this.id.hashCode() * 31)) * 31;
        Integer num = this.version;
        int a11 = C2454a.a(this.selectedFrame, C2454a.a(this.selectedStory, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
        Boolean bool = this.canClose;
        return this.stories.hashCode() + ((a11 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        CbottomType cbottomType = this.type;
        Integer num = this.version;
        int i11 = this.selectedStory;
        int i12 = this.selectedFrame;
        Boolean bool = this.canClose;
        List<StoryDTO> list = this.stories;
        StringBuilder sb2 = new StringBuilder("Cbottom2StoriesDTO(id=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(cbottomType);
        sb2.append(", version=");
        sb2.append(num);
        sb2.append(", selectedStory=");
        sb2.append(i11);
        sb2.append(", selectedFrame=");
        sb2.append(i12);
        sb2.append(", canClose=");
        sb2.append(bool);
        sb2.append(", stories=");
        return C2618u.h(sb2, list, ")");
    }

    @Override // B40.a
    public boolean updateLazyColumnWidgetsOrder(List<? extends F40.a> list, boolean z11, String str, List<String> list2) {
        return a.C1999a.a(this, list, z11, str, list2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.type.name());
        Integer num = this.version;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        dest.writeInt(this.selectedStory);
        dest.writeInt(this.selectedFrame);
        Boolean bool = this.canClose;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        Iterator c11 = Bi.a.c(this.stories, dest);
        while (c11.hasNext()) {
            ((StoryDTO) c11.next()).writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ Cbottom2StoriesDTO(String str, CbottomType cbottomType, Integer num, int i11, int i12, Boolean bool, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? CbottomType.STORIES : cbottomType, (i13 & 4) != 0 ? 1 : num, i11, i12, bool, list);
    }
}
