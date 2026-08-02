package com.vk.dto.nft;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.List;
import java.util.Objects;
import xsna.epx;

/* compiled from: NftMeta.kt */
/* loaded from: classes18.dex */
public final class NftMeta extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NftMeta> CREATOR = new b();
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final String m;
    public final String n;
    public final NftCollection o;
    public final List<NftOrigin> p;
    public final NftAttachmentPresentationMode q;

    /* compiled from: NftMeta.kt */
    public static final class a {
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        public static com.vk.dto.nft.NftMeta a(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
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
            java.lang.NullPointerException
            */
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<NftMeta> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NftMeta a(Serializer serializer) {
            return new NftMeta((UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.m(), serializer.H(), serializer.H(), (NftCollection) serializer.A(NftCollection.class.getClassLoader()), serializer.k(NftOrigin.class), (NftAttachmentPresentationMode) serializer.C());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NftMeta[i];
        }
    }

    public NftMeta(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, String str11, NftCollection nftCollection, List<NftOrigin> list, NftAttachmentPresentationMode nftAttachmentPresentationMode) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = z;
        this.m = str10;
        this.n = str11;
        this.o = nftCollection;
        this.p = list;
        this.q = nftAttachmentPresentationMode;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.j0(this.m);
        serializer.j0(this.n);
        serializer.e0(this.o);
        serializer.W(this.p);
        serializer.g0(this.q);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NftMeta)) {
            return false;
        }
        NftMeta nftMeta = (NftMeta) obj;
        return epx.f(this.c, nftMeta.c) && epx.f(this.d, nftMeta.d);
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d);
    }

    public final String toString() {
        return "NftMeta(ownerId=" + this.b + ", walletPublicId=" + this.c + ", nftPublicId=" + this.d + ", title=" + this.e + ", description=" + this.f + ", blockchainName=" + this.g + ", contractId=" + this.h + ", tokenId=" + this.i + ", ownerName=" + this.j + ", ownerAvatar=" + this.k + ", ownerAvatarIsNft=" + this.l + ", nftPreview=" + this.m + ", appLogo=" + this.n + ", nftCollection=" + this.o + ", origins=" + this.p + ", attachmentPresentationMode=" + this.q + ')';
    }
}
