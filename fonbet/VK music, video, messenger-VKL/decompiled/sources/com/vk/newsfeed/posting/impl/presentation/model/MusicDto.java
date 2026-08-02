package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class MusicDto implements Parcelable, UploadDto {
    public static final Parcelable.Creator<MusicDto> CREATOR = new a();
    public final String b;
    public final UserId c;
    public final int d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final MusicTrack m;
    public final UploadDto.UploadState n;
    public final long o;

    /* compiled from: PostingViewState.kt */
    public static final class a implements Parcelable.Creator<MusicDto> {
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
            	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
            	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
            */
        @Override // android.os.Parcelable.Creator
        public final com.vk.newsfeed.posting.impl.presentation.model.MusicDto createFromParcel(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
            	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
            	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
            */

        @Override // android.os.Parcelable.Creator
        public final MusicDto[] newArray(int i) {
            return new MusicDto[i];
        }
    }

    public MusicDto(String str, UserId userId, int i, String str2, String str3, boolean z, String str4, String str5, String str6, boolean z2, boolean z3, MusicTrack musicTrack, UploadDto.UploadState uploadState, long j) {
        this.b = str;
        this.c = userId;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = z2;
        this.l = z3;
        this.m = musicTrack;
        this.n = uploadState;
        this.o = j;
    }

    public static MusicDto a(MusicDto musicDto, boolean z, MusicTrack musicTrack, UploadDto.UploadState uploadState, int i) {
        String str = musicDto.b;
        UserId userId = musicDto.c;
        int i2 = musicDto.d;
        String str2 = musicDto.e;
        String str3 = musicDto.f;
        boolean z2 = musicDto.g;
        String str4 = musicDto.h;
        String str5 = musicDto.i;
        String str6 = musicDto.j;
        boolean z3 = musicDto.k;
        boolean z4 = (i & 1024) != 0 ? musicDto.l : z;
        MusicTrack musicTrack2 = (i & 2048) != 0 ? musicDto.m : musicTrack;
        UploadDto.UploadState uploadState2 = (i & 4096) != 0 ? musicDto.n : uploadState;
        long j = musicDto.o;
        musicDto.getClass();
        return new MusicDto(str, userId, i2, str2, str3, z2, str4, str5, str6, z3, z4, musicTrack2, uploadState2, j);
    }

    @Override // com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto
    public final UploadDto.UploadState I4() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto
    public final long e9() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicDto)) {
            return false;
        }
        MusicDto musicDto = (MusicDto) obj;
        return epx.f(this.b, musicDto.b) && epx.f(this.c, musicDto.c) && this.d == musicDto.d && epx.f(this.e, musicDto.e) && epx.f(this.f, musicDto.f) && this.g == musicDto.g && epx.f(this.h, musicDto.h) && epx.f(this.i, musicDto.i) && epx.f(this.j, musicDto.j) && this.k == musicDto.k && this.l == musicDto.l && epx.f(this.m, musicDto.m) && epx.f(this.n, musicDto.n) && this.o == musicDto.o;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(qoy.b(urd0.a(urd0.a(shy.a(this.d, bh10.a(this.b.hashCode() * 31, 31, this.c.b), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int b = qoy.b(qoy.b((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.k), 31, this.l);
        MusicTrack musicTrack = this.m;
        return Long.hashCode(this.o) + ((this.n.hashCode() + ((b + (musicTrack != null ? musicTrack.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicDto(id=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", audioId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", additionalInfo=");
        sb.append(this.f);
        sb.append(", hasIllegalNoticeType=");
        sb.append(this.g);
        sb.append(", allArtistsText=");
        sb.append(this.h);
        sb.append(", subtitle=");
        sb.append(this.i);
        sb.append(", photoUrl=");
        sb.append(this.j);
        sb.append(", isPlaylist=");
        sb.append(this.k);
        sb.append(", isSnippet=");
        sb.append(this.l);
        sb.append(", track=");
        sb.append(this.m);
        sb.append(", uploadState=");
        sb.append(this.n);
        sb.append(", uploadSize=");
        return vu5.a(')', this.o, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeParcelable(this.m, i);
        this.n.writeToParcel(parcel, i);
        parcel.writeLong(this.o);
    }

    @Override // com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto
    public final Object x2() {
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MusicDto(String str, UserId userId, int i, String str2, String str3, boolean z, String str4, String str5, String str6, boolean z2, boolean z3, MusicTrack musicTrack, UploadDto.UploadState uploadState, long j, int i2, zcl zclVar) {
        this(str, userId, i, str2, str3, z, str4, str5, str6, z2, z3, musicTrack, r14, j);
        UploadDto.UploadState uploadState2;
        if ((i2 & 4096) != 0) {
            UploadDto.b7.getClass();
            uploadState2 = UploadDto.a.b;
        } else {
            uploadState2 = uploadState;
        }
    }
}
