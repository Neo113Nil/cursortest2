package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.dfp0;
import xsna.efz;
import xsna.epx;
import xsna.i7o0;
import xsna.oap;
import xsna.zrp;

/* compiled from: UIBlockSearchAuthor.kt */
/* loaded from: classes16.dex */
public final class UIBlockSearchAuthor extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockSearchAuthor> CREATOR = new b();
    public final String A;
    public final String B;
    public final CatalogProfileLocalState C;
    public final String D;
    public final oap<? extends UserProfile, ? extends Group> y;
    public final AuthorType z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UIBlockSearchAuthor.kt */
    public static final class AuthorType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AuthorType[] $VALUES;
        public static final AuthorType Clips;
        public static final a Companion;
        public static final AuthorType Videos;
        private final String value;

        /* compiled from: UIBlockSearchAuthor.kt */
        public static final class a {
            public static AuthorType a(String str) {
                for (AuthorType authorType : AuthorType.values()) {
                    if (epx.f(authorType.h(), str)) {
                        return authorType;
                    }
                }
                return null;
            }
        }

        static {
            AuthorType authorType = new AuthorType("Clips", 0, "clips");
            Clips = authorType;
            AuthorType authorType2 = new AuthorType("Videos", 1, "videos");
            Videos = authorType2;
            AuthorType[] authorTypeArr = {authorType, authorType2};
            $VALUES = authorTypeArr;
            $ENTRIES = new asp(authorTypeArr);
            Companion = new a();
        }

        public AuthorType(String str, int i, String str2) {
            this.value = str2;
        }

        public static AuthorType valueOf(String str) {
            return (AuthorType) Enum.valueOf(AuthorType.class, str);
        }

        public static AuthorType[] values() {
            return (AuthorType[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<UIBlockSearchAuthor> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockSearchAuthor a(Serializer serializer) {
            return new UIBlockSearchAuthor(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockSearchAuthor[i];
        }
    }

    public UIBlockSearchAuthor(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, a aVar) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = aVar.b;
        this.D = aVar.a;
        AuthorType authorType = aVar.c;
        this.z = authorType == null ? AuthorType.Clips : authorType;
        this.A = aVar.d;
        this.B = aVar.e;
        this.C = aVar.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        UserId userId;
        oap<? extends UserProfile, ? extends Group> oapVar = this.y;
        if (oapVar instanceof oap.b) {
            userId = ((Group) ((oap.b) oapVar).a).c;
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            userId = ((UserProfile) ((oap.a) oapVar).a).c;
        }
        return String.valueOf(userId.b);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.D);
        oap<? extends UserProfile, ? extends Group> oapVar = this.y;
        UserProfile a2 = oapVar.a();
        Group b2 = oapVar.b();
        serializer.i0(a2);
        serializer.i0(b2);
        serializer.j0(this.z.h());
        serializer.j0(this.A);
        serializer.j0(this.B);
        serializer.i0(this.C);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final UserId Pb() {
        oap<? extends UserProfile, ? extends Group> oapVar = this.y;
        if (oapVar instanceof oap.b) {
            return ((Group) ((oap.b) oapVar).a).c;
        }
        if (oapVar instanceof oap.a) {
            return ((UserProfile) ((oap.a) oapVar).a).c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UIBlockSearchAuthor) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockSearchAuthor uIBlockSearchAuthor = (UIBlockSearchAuthor) obj;
        if (!epx.f(this.D, uIBlockSearchAuthor.D) || this.z != uIBlockSearchAuthor.z || !epx.f(this.A, uIBlockSearchAuthor.A) || !epx.f(this.B, uIBlockSearchAuthor.B) || !epx.f(this.C, uIBlockSearchAuthor.C)) {
            return false;
        }
        oap<? extends UserProfile, ? extends Group> oapVar = uIBlockSearchAuthor.y;
        oap<? extends UserProfile, ? extends Group> oapVar2 = this.y;
        if (oapVar2 instanceof oap.b) {
            Group group = (Group) ((oap.b) oapVar2).a;
            Group b2 = oapVar.b();
            return b2 != null && epx.f(group, b2) && group.j == b2.j && epx.f(group.k0, b2.k0);
        }
        if (!(oapVar2 instanceof oap.a)) {
            throw new NoWhenBranchMatchedException();
        }
        UserProfile userProfile = (UserProfile) ((oap.a) oapVar2).a;
        UserProfile a2 = oapVar.a();
        return a2 != null && epx.f(userProfile, a2) && userProfile.M() == a2.M();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.D, this.y, this.z, this.A, this.B, this.C);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        UserId userId;
        StringBuilder sb = new StringBuilder("UIBlockSearchAuthor[id:");
        sb.append(this.b);
        sb.append(" trackcode:");
        sb.append(this.D);
        sb.append(" userId:");
        oap<? extends UserProfile, ? extends Group> oapVar = this.y;
        if (oapVar instanceof oap.b) {
            userId = ((Group) ((oap.b) oapVar).a).c;
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            userId = ((UserProfile) ((oap.a) oapVar).a).c;
        }
        return efz.b(userId.b, " ]", sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        oap aVar;
        oap<? extends UserProfile, ? extends Group> oapVar = this.y;
        if (oapVar instanceof oap.b) {
            aVar = new oap.b(new Group((Group) ((oap.b) oapVar).a));
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new oap.a(new UserProfile((UserProfile) ((oap.a) oapVar).a));
        }
        oap oapVar2 = aVar;
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        UIBlockHint uIBlockHint = this.j;
        return new UIBlockSearchAuthor(this.b, this.d, this.e, this.f, a2, a3, hashSet, uIBlockHint != null ? uIBlockHint.zb() : null, new a(this.D, oapVar2, this.z, this.A, this.B, CatalogProfileLocalState.zb(this.C)));
    }

    /* compiled from: UIBlockSearchAuthor.kt */
    public static final class a {
        public final String a;
        public final oap<UserProfile, Group> b;
        public final AuthorType c;
        public final String d;
        public final String e;
        public final CatalogProfileLocalState f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, oap<? extends UserProfile, ? extends Group> oapVar, AuthorType authorType, String str2, String str3, CatalogProfileLocalState catalogProfileLocalState) {
            this.a = str;
            this.b = oapVar;
            this.c = authorType;
            this.d = str2;
            this.e = str3;
            this.f = catalogProfileLocalState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            AuthorType authorType = this.c;
            int hashCode2 = (hashCode + (authorType == null ? 0 : authorType.hashCode())) * 31;
            String str2 = this.d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return this.f.b.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "BlockData(trackCode=" + this.a + ", profileOrGroup=" + this.b + ", authorType=" + this.c + ", description=" + this.d + ", authorPageSectionId=" + this.e + ", localState=" + this.f + ')';
        }

        public /* synthetic */ a(String str, oap oapVar, AuthorType authorType, String str2, String str3) {
            this(str, oapVar, authorType, str2, str3, new CatalogProfileLocalState(null, 1, null));
        }
    }

    public UIBlockSearchAuthor(Serializer serializer) {
        super(serializer);
        oap bVar;
        this.D = serializer.H();
        UserProfile userProfile = (UserProfile) serializer.G(UserProfile.class.getClassLoader());
        Group group = (Group) serializer.G(Group.class.getClassLoader());
        if (userProfile != null) {
            bVar = new oap.a(userProfile);
        } else {
            bVar = group != null ? new oap.b(group) : null;
        }
        this.y = bVar;
        AuthorType.a aVar = AuthorType.Companion;
        String H = serializer.H();
        aVar.getClass();
        AuthorType a2 = AuthorType.a.a(H);
        this.z = a2 == null ? AuthorType.Clips : a2;
        this.A = serializer.H();
        this.B = serializer.H();
        this.C = (CatalogProfileLocalState) serializer.G(CatalogProfileLocalState.class.getClassLoader());
    }
}
