package ru.ozon.android.messenger.framework.presentation.ai;

import B90.C2618u;
import Kk.C3532b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9409a implements ru.ozon.android.messenger.framework.presentation.chatdetail.a, Parcelable {

    @NotNull
    public static final Parcelable.Creator<C9409a> CREATOR = new C1647a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f89407a;

    /* renamed from: b, reason: collision with root package name */
    private final String f89408b;

    /* renamed from: c, reason: collision with root package name */
    private final String f89409c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f89410d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f89411e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<ru.ozon.android.messenger.framework.presentation.models.q> f89412f;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.a$a, reason: collision with other inner class name */
    public static final class C1647a implements Parcelable.Creator<C9409a> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final C9409a createFromParcel(Parcel parcel) {
            int i11;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Uri uri = (Uri) parcel.readParcelable(C9409a.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                i11 = 0;
                z11 = true;
            } else {
                i11 = 0;
            }
            boolean z12 = parcel.readInt() != 0 ? 1 : i11;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (i11 != readInt) {
                i11 = Ak.b.b(ru.ozon.android.messenger.framework.presentation.models.q.CREATOR, parcel, arrayList, i11, 1);
            }
            return new C9409a(uri, readString, readString2, z11, z12, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final C9409a[] newArray(int i11) {
            return new C9409a[i11];
        }
    }

    public C9409a(@NotNull Uri deeplink, String str, String str2, boolean z11, boolean z12, @NotNull List<ru.ozon.android.messenger.framework.presentation.models.q> noUiItems) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(noUiItems, "noUiItems");
        this.f89407a = deeplink;
        this.f89408b = str;
        this.f89409c = str2;
        this.f89410d = z11;
        this.f89411e = z12;
        this.f89412f = noUiItems;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.a
    public final String a() {
        return this.f89408b;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.a
    public final boolean b() {
        return this.f89410d;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.a
    public final boolean c() {
        return this.f89411e;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.a
    public final String d() {
        return this.f89409c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final List<ru.ozon.android.messenger.framework.presentation.models.q> e() {
        return this.f89412f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9409a)) {
            return false;
        }
        C9409a c9409a = (C9409a) obj;
        return Intrinsics.d(this.f89407a, c9409a.f89407a) && Intrinsics.d(this.f89408b, c9409a.f89408b) && Intrinsics.d(this.f89409c, c9409a.f89409c) && this.f89410d == c9409a.f89410d && this.f89411e == c9409a.f89411e && Intrinsics.d(this.f89412f, c9409a.f89412f);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.a
    @NotNull
    public final Uri getDeeplink() {
        return this.f89407a;
    }

    public final int hashCode() {
        int hashCode = this.f89407a.hashCode() * 31;
        String str = this.f89408b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f89409c;
        return this.f89412f.hashCode() + C3532b.a(C3532b.a((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f89410d), 31, this.f89411e);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AiAssistantArgs(deeplink=");
        sb2.append(this.f89407a);
        sb2.append(", chatId=");
        sb2.append(this.f89408b);
        sb2.append(", firstUnreadMsgId=");
        sb2.append(this.f89409c);
        sb2.append(", isForceScroll=");
        sb2.append(this.f89410d);
        sb2.append(", withDateAndUnreadWidgets=");
        sb2.append(this.f89411e);
        sb2.append(", noUiItems=");
        return C2618u.h(sb2, this.f89412f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89407a, i11);
        dest.writeString(this.f89408b);
        dest.writeString(this.f89409c);
        dest.writeInt(this.f89410d ? 1 : 0);
        dest.writeInt(this.f89411e ? 1 : 0);
        Iterator c11 = Bi.a.c(this.f89412f, dest);
        while (c11.hasNext()) {
            ((ru.ozon.android.messenger.framework.presentation.models.q) c11.next()).writeToParcel(dest, i11);
        }
    }
}
