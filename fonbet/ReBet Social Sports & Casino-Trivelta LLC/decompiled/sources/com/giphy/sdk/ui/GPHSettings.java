package com.giphy.sdk.ui;

import S8.c;
import W9.d;
import X9.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.gifdecoder.e;
import com.giphy.sdk.core.models.enums.RatingType;
import com.giphy.sdk.core.models.enums.RenditionType;
import com.google.android.material.shape.i;
import com.google.crypto.tink.integration.android.b;
import i3.C4527h;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\bK\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 Jä\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b,\u0010'J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b1\u00102R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010>\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010M\u001a\u0004\bF\u0010O\"\u0004\bS\u0010QR$\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010M\u001a\u0004\bL\u0010O\"\u0004\bU\u0010QR\"\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010>\u001a\u0004\bW\u0010@\"\u0004\bX\u0010BR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010'\"\u0004\b\\\u0010]R\"\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010>\u001a\u0004\bd\u0010@\"\u0004\be\u0010BR\"\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010>\u001a\u0004\b>\u0010@\"\u0004\bf\u0010BR\"\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010>\u001a\u0004\bT\u0010@\"\u0004\bg\u0010BR\"\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010>\u001a\u0004\bY\u0010@\"\u0004\bi\u0010BR\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\b^\u0010l\"\u0004\bm\u0010nR\"\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010>\u001a\u0004\bR\u0010@\"\u0004\bp\u0010BR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010\u001d\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010>\u001a\u0004\bC\u0010@\"\u0004\bx\u0010BR\"\u0010\u001e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010>\u001a\u0004\bV\u0010@\"\u0004\bz\u0010B¨\u0006{"}, d2 = {"Lcom/giphy/sdk/ui/GPHSettings;", "Landroid/os/Parcelable;", "LS8/c;", "theme", "", "Lcom/giphy/sdk/ui/GPHContentType;", "mediaTypeConfig", "", "showConfirmationScreen", "showAttribution", "Lcom/giphy/sdk/core/models/enums/RatingType;", "rating", "Lcom/giphy/sdk/core/models/enums/RenditionType;", "renditionType", "clipsPreviewRenditionType", "confirmationRenditionType", "showCheckeredBackground", "", "stickerColumnCount", "selectedContentType", "showSuggestionsBar", "suggestionsBarFixedPosition", "enableDynamicText", "enablePartnerProfiles", "LQ8/e;", "imageFormat", "disableEmojiVariations", "", "trayHeightMultiplier", "autoCloseOnMediaSelect", "enableEdgeToEdge", "<init>", "(LS8/c;[Lcom/giphy/sdk/ui/GPHContentType;ZZLcom/giphy/sdk/core/models/enums/RatingType;Lcom/giphy/sdk/core/models/enums/RenditionType;Lcom/giphy/sdk/core/models/enums/RenditionType;Lcom/giphy/sdk/core/models/enums/RenditionType;ZILcom/giphy/sdk/ui/GPHContentType;ZZZZLQ8/e;ZFZZ)V", "a", "(LS8/c;[Lcom/giphy/sdk/ui/GPHContentType;ZZLcom/giphy/sdk/core/models/enums/RatingType;Lcom/giphy/sdk/core/models/enums/RenditionType;Lcom/giphy/sdk/core/models/enums/RenditionType;Lcom/giphy/sdk/core/models/enums/RenditionType;ZILcom/giphy/sdk/ui/GPHContentType;ZZZZLQ8/e;ZFZZ)Lcom/giphy/sdk/ui/GPHSettings;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "LS8/c;", "a0", "()LS8/c;", "r0", "(LS8/c;)V", "[Lcom/giphy/sdk/ui/GPHContentType;", "k", "()[Lcom/giphy/sdk/ui/GPHContentType;", "j0", "([Lcom/giphy/sdk/ui/GPHContentType;)V", b.f37029b, "Z", "O", "()Z", "o0", "(Z)V", "c", "getShowAttribution", "setShowAttribution", d.f13160a, "Lcom/giphy/sdk/core/models/enums/RatingType;", "l", "()Lcom/giphy/sdk/core/models/enums/RatingType;", "k0", "(Lcom/giphy/sdk/core/models/enums/RatingType;)V", e.f29601m, "Lcom/giphy/sdk/core/models/enums/RenditionType;", m.f13664a, "()Lcom/giphy/sdk/core/models/enums/RenditionType;", "l0", "(Lcom/giphy/sdk/core/models/enums/RenditionType;)V", "f", "e0", "g", "f0", C4527h.f48087o, "N", "n0", i.f35755A, "I", "Y", "q0", "(I)V", "j", "Lcom/giphy/sdk/ui/GPHContentType;", "J", "()Lcom/giphy/sdk/ui/GPHContentType;", "m0", "(Lcom/giphy/sdk/ui/GPHContentType;)V", "U", "p0", "setSuggestionsBarFixedPosition", "g0", "n", "i0", "o", "LQ8/e;", "()LQ8/e;", "setImageFormat", "(LQ8/e;)V", "p", "setDisableEmojiVariations", "q", "F", "d0", "()F", "s0", "(F)V", "r", "setAutoCloseOnMediaSelect", "s", "h0", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GPHSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GPHSettings> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public c theme;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean showConfirmationScreen;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean showAttribution;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public RatingType rating;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public RenditionType renditionType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public RenditionType clipsPreviewRenditionType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public RenditionType confirmationRenditionType;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean showCheckeredBackground;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    public int stickerColumnCount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public GPHContentType selectedContentType;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean showSuggestionsBar;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean suggestionsBarFixedPosition;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean enableDynamicText;

    @NotNull
    private GPHContentType[] mediaTypeConfig;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean enablePartnerProfiles;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    public Q8.e imageFormat;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean disableEmojiVariations;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    public float trayHeightMultiplier;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean autoCloseOnMediaSelect;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean enableEdgeToEdge;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GPHSettings createFromParcel(Parcel parcel) {
            boolean z10;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            c valueOf = c.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            GPHContentType[] gPHContentTypeArr = new GPHContentType[readInt];
            for (int i10 = 0; i10 != readInt; i10++) {
                gPHContentTypeArr[i10] = GPHContentType.CREATOR.createFromParcel(parcel);
            }
            boolean z11 = true;
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = true;
                z11 = false;
            }
            return new GPHSettings(valueOf, gPHContentTypeArr, z11, parcel.readInt() != 0 ? z10 : false, RatingType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : RenditionType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : RenditionType.valueOf(parcel.readString()), parcel.readInt() != 0 ? RenditionType.valueOf(parcel.readString()) : null, parcel.readInt() != 0 ? z10 : false, parcel.readInt(), GPHContentType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? z10 : false, parcel.readInt() != 0 ? z10 : false, parcel.readInt() != 0 ? z10 : false, parcel.readInt() != 0 ? z10 : false, Q8.e.valueOf(parcel.readString()), parcel.readInt() != 0 ? z10 : false, parcel.readFloat(), parcel.readInt() != 0 ? z10 : false, parcel.readInt() != 0 ? z10 : false);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GPHSettings[] newArray(int i10) {
            return new GPHSettings[i10];
        }
    }

    public GPHSettings(c theme, GPHContentType[] mediaTypeConfig, boolean z10, boolean z11, RatingType rating, RenditionType renditionType, RenditionType renditionType2, RenditionType renditionType3, boolean z12, int i10, GPHContentType selectedContentType, boolean z13, boolean z14, boolean z15, boolean z16, Q8.e imageFormat, boolean z17, float f10, boolean z18, boolean z19) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(mediaTypeConfig, "mediaTypeConfig");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(selectedContentType, "selectedContentType");
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        this.theme = theme;
        this.mediaTypeConfig = mediaTypeConfig;
        this.showConfirmationScreen = z10;
        this.showAttribution = z11;
        this.rating = rating;
        this.renditionType = renditionType;
        this.clipsPreviewRenditionType = renditionType2;
        this.confirmationRenditionType = renditionType3;
        this.showCheckeredBackground = z12;
        this.stickerColumnCount = i10;
        this.selectedContentType = selectedContentType;
        this.showSuggestionsBar = z13;
        this.suggestionsBarFixedPosition = z14;
        this.enableDynamicText = z15;
        this.enablePartnerProfiles = z16;
        this.imageFormat = imageFormat;
        this.disableEmojiVariations = z17;
        this.trayHeightMultiplier = f10;
        this.autoCloseOnMediaSelect = z18;
        this.enableEdgeToEdge = z19;
    }

    public static /* synthetic */ GPHSettings b(GPHSettings gPHSettings, c cVar, GPHContentType[] gPHContentTypeArr, boolean z10, boolean z11, RatingType ratingType, RenditionType renditionType, RenditionType renditionType2, RenditionType renditionType3, boolean z12, int i10, GPHContentType gPHContentType, boolean z13, boolean z14, boolean z15, boolean z16, Q8.e eVar, boolean z17, float f10, boolean z18, boolean z19, int i11, Object obj) {
        boolean z20;
        boolean z21;
        c cVar2 = (i11 & 1) != 0 ? gPHSettings.theme : cVar;
        GPHContentType[] gPHContentTypeArr2 = (i11 & 2) != 0 ? gPHSettings.mediaTypeConfig : gPHContentTypeArr;
        boolean z22 = (i11 & 4) != 0 ? gPHSettings.showConfirmationScreen : z10;
        boolean z23 = (i11 & 8) != 0 ? gPHSettings.showAttribution : z11;
        RatingType ratingType2 = (i11 & 16) != 0 ? gPHSettings.rating : ratingType;
        RenditionType renditionType4 = (i11 & 32) != 0 ? gPHSettings.renditionType : renditionType;
        RenditionType renditionType5 = (i11 & 64) != 0 ? gPHSettings.clipsPreviewRenditionType : renditionType2;
        RenditionType renditionType6 = (i11 & 128) != 0 ? gPHSettings.confirmationRenditionType : renditionType3;
        boolean z24 = (i11 & 256) != 0 ? gPHSettings.showCheckeredBackground : z12;
        int i12 = (i11 & 512) != 0 ? gPHSettings.stickerColumnCount : i10;
        GPHContentType gPHContentType2 = (i11 & 1024) != 0 ? gPHSettings.selectedContentType : gPHContentType;
        boolean z25 = (i11 & 2048) != 0 ? gPHSettings.showSuggestionsBar : z13;
        boolean z26 = (i11 & 4096) != 0 ? gPHSettings.suggestionsBarFixedPosition : z14;
        boolean z27 = (i11 & 8192) != 0 ? gPHSettings.enableDynamicText : z15;
        c cVar3 = cVar2;
        boolean z28 = (i11 & 16384) != 0 ? gPHSettings.enablePartnerProfiles : z16;
        Q8.e eVar2 = (i11 & 32768) != 0 ? gPHSettings.imageFormat : eVar;
        boolean z29 = (i11 & PKIFailureInfo.notAuthorized) != 0 ? gPHSettings.disableEmojiVariations : z17;
        float f11 = (i11 & PKIFailureInfo.unsupportedVersion) != 0 ? gPHSettings.trayHeightMultiplier : f10;
        boolean z30 = (i11 & PKIFailureInfo.transactionIdInUse) != 0 ? gPHSettings.autoCloseOnMediaSelect : z18;
        if ((i11 & PKIFailureInfo.signerNotTrusted) != 0) {
            z21 = z30;
            z20 = gPHSettings.enableEdgeToEdge;
        } else {
            z20 = z19;
            z21 = z30;
        }
        return gPHSettings.a(cVar3, gPHContentTypeArr2, z22, z23, ratingType2, renditionType4, renditionType5, renditionType6, z24, i12, gPHContentType2, z25, z26, z27, z28, eVar2, z29, f11, z21, z20);
    }

    /* renamed from: J, reason: from getter */
    public final GPHContentType getSelectedContentType() {
        return this.selectedContentType;
    }

    /* renamed from: N, reason: from getter */
    public final boolean getShowCheckeredBackground() {
        return this.showCheckeredBackground;
    }

    /* renamed from: O, reason: from getter */
    public final boolean getShowConfirmationScreen() {
        return this.showConfirmationScreen;
    }

    /* renamed from: U, reason: from getter */
    public final boolean getShowSuggestionsBar() {
        return this.showSuggestionsBar;
    }

    /* renamed from: Y, reason: from getter */
    public final int getStickerColumnCount() {
        return this.stickerColumnCount;
    }

    /* renamed from: Z, reason: from getter */
    public final boolean getSuggestionsBarFixedPosition() {
        return this.suggestionsBarFixedPosition;
    }

    public final GPHSettings a(c theme, GPHContentType[] mediaTypeConfig, boolean showConfirmationScreen, boolean showAttribution, RatingType rating, RenditionType renditionType, RenditionType clipsPreviewRenditionType, RenditionType confirmationRenditionType, boolean showCheckeredBackground, int stickerColumnCount, GPHContentType selectedContentType, boolean showSuggestionsBar, boolean suggestionsBarFixedPosition, boolean enableDynamicText, boolean enablePartnerProfiles, Q8.e imageFormat, boolean disableEmojiVariations, float trayHeightMultiplier, boolean autoCloseOnMediaSelect, boolean enableEdgeToEdge) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(mediaTypeConfig, "mediaTypeConfig");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(selectedContentType, "selectedContentType");
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return new GPHSettings(theme, mediaTypeConfig, showConfirmationScreen, showAttribution, rating, renditionType, clipsPreviewRenditionType, confirmationRenditionType, showCheckeredBackground, stickerColumnCount, selectedContentType, showSuggestionsBar, suggestionsBarFixedPosition, enableDynamicText, enablePartnerProfiles, imageFormat, disableEmojiVariations, trayHeightMultiplier, autoCloseOnMediaSelect, enableEdgeToEdge);
    }

    /* renamed from: a0, reason: from getter */
    public final c getTheme() {
        return this.theme;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getAutoCloseOnMediaSelect() {
        return this.autoCloseOnMediaSelect;
    }

    /* renamed from: d, reason: from getter */
    public final RenditionType getClipsPreviewRenditionType() {
        return this.clipsPreviewRenditionType;
    }

    /* renamed from: d0, reason: from getter */
    public final float getTrayHeightMultiplier() {
        return this.trayHeightMultiplier;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final RenditionType getConfirmationRenditionType() {
        return this.confirmationRenditionType;
    }

    public final void e0(RenditionType renditionType) {
        this.clipsPreviewRenditionType = renditionType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GPHSettings)) {
            return false;
        }
        GPHSettings gPHSettings = (GPHSettings) other;
        return this.theme == gPHSettings.theme && Intrinsics.areEqual(this.mediaTypeConfig, gPHSettings.mediaTypeConfig) && this.showConfirmationScreen == gPHSettings.showConfirmationScreen && this.showAttribution == gPHSettings.showAttribution && this.rating == gPHSettings.rating && this.renditionType == gPHSettings.renditionType && this.clipsPreviewRenditionType == gPHSettings.clipsPreviewRenditionType && this.confirmationRenditionType == gPHSettings.confirmationRenditionType && this.showCheckeredBackground == gPHSettings.showCheckeredBackground && this.stickerColumnCount == gPHSettings.stickerColumnCount && this.selectedContentType == gPHSettings.selectedContentType && this.showSuggestionsBar == gPHSettings.showSuggestionsBar && this.suggestionsBarFixedPosition == gPHSettings.suggestionsBarFixedPosition && this.enableDynamicText == gPHSettings.enableDynamicText && this.enablePartnerProfiles == gPHSettings.enablePartnerProfiles && this.imageFormat == gPHSettings.imageFormat && this.disableEmojiVariations == gPHSettings.disableEmojiVariations && Float.compare(this.trayHeightMultiplier, gPHSettings.trayHeightMultiplier) == 0 && this.autoCloseOnMediaSelect == gPHSettings.autoCloseOnMediaSelect && this.enableEdgeToEdge == gPHSettings.enableEdgeToEdge;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getDisableEmojiVariations() {
        return this.disableEmojiVariations;
    }

    public final void f0(RenditionType renditionType) {
        this.confirmationRenditionType = renditionType;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getEnableDynamicText() {
        return this.enableDynamicText;
    }

    public final void g0(boolean z10) {
        this.enableDynamicText = z10;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getEnableEdgeToEdge() {
        return this.enableEdgeToEdge;
    }

    public final void h0(boolean z10) {
        this.enableEdgeToEdge = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.theme.hashCode() * 31) + Arrays.hashCode(this.mediaTypeConfig)) * 31;
        boolean z10 = this.showConfirmationScreen;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.showAttribution;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int hashCode2 = (((i11 + i12) * 31) + this.rating.hashCode()) * 31;
        RenditionType renditionType = this.renditionType;
        int hashCode3 = (hashCode2 + (renditionType == null ? 0 : renditionType.hashCode())) * 31;
        RenditionType renditionType2 = this.clipsPreviewRenditionType;
        int hashCode4 = (hashCode3 + (renditionType2 == null ? 0 : renditionType2.hashCode())) * 31;
        RenditionType renditionType3 = this.confirmationRenditionType;
        int hashCode5 = (hashCode4 + (renditionType3 != null ? renditionType3.hashCode() : 0)) * 31;
        boolean z12 = this.showCheckeredBackground;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int hashCode6 = (((((hashCode5 + i13) * 31) + Integer.hashCode(this.stickerColumnCount)) * 31) + this.selectedContentType.hashCode()) * 31;
        boolean z13 = this.showSuggestionsBar;
        int i14 = z13;
        if (z13 != 0) {
            i14 = 1;
        }
        int i15 = (hashCode6 + i14) * 31;
        boolean z14 = this.suggestionsBarFixedPosition;
        int i16 = z14;
        if (z14 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z15 = this.enableDynamicText;
        int i18 = z15;
        if (z15 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        boolean z16 = this.enablePartnerProfiles;
        int i20 = z16;
        if (z16 != 0) {
            i20 = 1;
        }
        int hashCode7 = (((i19 + i20) * 31) + this.imageFormat.hashCode()) * 31;
        boolean z17 = this.disableEmojiVariations;
        int i21 = z17;
        if (z17 != 0) {
            i21 = 1;
        }
        int hashCode8 = (((hashCode7 + i21) * 31) + Float.hashCode(this.trayHeightMultiplier)) * 31;
        boolean z18 = this.autoCloseOnMediaSelect;
        int i22 = z18;
        if (z18 != 0) {
            i22 = 1;
        }
        int i23 = (hashCode8 + i22) * 31;
        boolean z19 = this.enableEdgeToEdge;
        return i23 + (z19 ? 1 : z19 ? 1 : 0);
    }

    /* renamed from: i, reason: from getter */
    public final boolean getEnablePartnerProfiles() {
        return this.enablePartnerProfiles;
    }

    public final void i0(boolean z10) {
        this.enablePartnerProfiles = z10;
    }

    /* renamed from: j, reason: from getter */
    public final Q8.e getImageFormat() {
        return this.imageFormat;
    }

    public final void j0(GPHContentType[] gPHContentTypeArr) {
        Intrinsics.checkNotNullParameter(gPHContentTypeArr, "<set-?>");
        this.mediaTypeConfig = gPHContentTypeArr;
    }

    /* renamed from: k, reason: from getter */
    public final GPHContentType[] getMediaTypeConfig() {
        return this.mediaTypeConfig;
    }

    public final void k0(RatingType ratingType) {
        Intrinsics.checkNotNullParameter(ratingType, "<set-?>");
        this.rating = ratingType;
    }

    /* renamed from: l, reason: from getter */
    public final RatingType getRating() {
        return this.rating;
    }

    public final void l0(RenditionType renditionType) {
        this.renditionType = renditionType;
    }

    /* renamed from: m, reason: from getter */
    public final RenditionType getRenditionType() {
        return this.renditionType;
    }

    public final void m0(GPHContentType gPHContentType) {
        Intrinsics.checkNotNullParameter(gPHContentType, "<set-?>");
        this.selectedContentType = gPHContentType;
    }

    public final void n0(boolean z10) {
        this.showCheckeredBackground = z10;
    }

    public final void o0(boolean z10) {
        this.showConfirmationScreen = z10;
    }

    public final void p0(boolean z10) {
        this.showSuggestionsBar = z10;
    }

    public final void q0(int i10) {
        this.stickerColumnCount = i10;
    }

    public final void r0(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.theme = cVar;
    }

    public final void s0(float f10) {
        this.trayHeightMultiplier = f10;
    }

    public String toString() {
        return "GPHSettings(theme=" + this.theme + ", mediaTypeConfig=" + Arrays.toString(this.mediaTypeConfig) + ", showConfirmationScreen=" + this.showConfirmationScreen + ", showAttribution=" + this.showAttribution + ", rating=" + this.rating + ", renditionType=" + this.renditionType + ", clipsPreviewRenditionType=" + this.clipsPreviewRenditionType + ", confirmationRenditionType=" + this.confirmationRenditionType + ", showCheckeredBackground=" + this.showCheckeredBackground + ", stickerColumnCount=" + this.stickerColumnCount + ", selectedContentType=" + this.selectedContentType + ", showSuggestionsBar=" + this.showSuggestionsBar + ", suggestionsBarFixedPosition=" + this.suggestionsBarFixedPosition + ", enableDynamicText=" + this.enableDynamicText + ", enablePartnerProfiles=" + this.enablePartnerProfiles + ", imageFormat=" + this.imageFormat + ", disableEmojiVariations=" + this.disableEmojiVariations + ", trayHeightMultiplier=" + this.trayHeightMultiplier + ", autoCloseOnMediaSelect=" + this.autoCloseOnMediaSelect + ", enableEdgeToEdge=" + this.enableEdgeToEdge + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.theme.name());
        GPHContentType[] gPHContentTypeArr = this.mediaTypeConfig;
        int length = gPHContentTypeArr.length;
        parcel.writeInt(length);
        for (int i10 = 0; i10 != length; i10++) {
            gPHContentTypeArr[i10].writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.showConfirmationScreen ? 1 : 0);
        parcel.writeInt(this.showAttribution ? 1 : 0);
        parcel.writeString(this.rating.name());
        RenditionType renditionType = this.renditionType;
        if (renditionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(renditionType.name());
        }
        RenditionType renditionType2 = this.clipsPreviewRenditionType;
        if (renditionType2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(renditionType2.name());
        }
        RenditionType renditionType3 = this.confirmationRenditionType;
        if (renditionType3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(renditionType3.name());
        }
        parcel.writeInt(this.showCheckeredBackground ? 1 : 0);
        parcel.writeInt(this.stickerColumnCount);
        this.selectedContentType.writeToParcel(parcel, flags);
        parcel.writeInt(this.showSuggestionsBar ? 1 : 0);
        parcel.writeInt(this.suggestionsBarFixedPosition ? 1 : 0);
        parcel.writeInt(this.enableDynamicText ? 1 : 0);
        parcel.writeInt(this.enablePartnerProfiles ? 1 : 0);
        parcel.writeString(this.imageFormat.name());
        parcel.writeInt(this.disableEmojiVariations ? 1 : 0);
        parcel.writeFloat(this.trayHeightMultiplier);
        parcel.writeInt(this.autoCloseOnMediaSelect ? 1 : 0);
        parcel.writeInt(this.enableEdgeToEdge ? 1 : 0);
    }

    public /* synthetic */ GPHSettings(c cVar, GPHContentType[] gPHContentTypeArr, boolean z10, boolean z11, RatingType ratingType, RenditionType renditionType, RenditionType renditionType2, RenditionType renditionType3, boolean z12, int i10, GPHContentType gPHContentType, boolean z13, boolean z14, boolean z15, boolean z16, Q8.e eVar, boolean z17, float f10, boolean z18, boolean z19, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? c.Automatic : cVar, (i11 & 2) != 0 ? new GPHContentType[]{GPHContentType.recents, GPHContentType.gif, GPHContentType.sticker, GPHContentType.text, GPHContentType.emoji, GPHContentType.clips} : gPHContentTypeArr, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? RatingType.pg13 : ratingType, (i11 & 32) != 0 ? null : renditionType, (i11 & 64) != 0 ? null : renditionType2, (i11 & 128) == 0 ? renditionType3 : null, (i11 & 256) != 0 ? false : z12, (i11 & 512) == 0 ? i10 : 2, (i11 & 1024) != 0 ? GPHContentType.gif : gPHContentType, (i11 & 2048) != 0 ? true : z13, (i11 & 4096) != 0 ? false : z14, (i11 & 8192) != 0 ? false : z15, (i11 & 16384) != 0 ? true : z16, (i11 & 32768) != 0 ? Q8.e.WEBP : eVar, (i11 & PKIFailureInfo.notAuthorized) != 0 ? false : z17, (i11 & PKIFailureInfo.unsupportedVersion) != 0 ? 0.75f : f10, (i11 & PKIFailureInfo.transactionIdInUse) != 0 ? true : z18, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? false : z19);
    }
}
