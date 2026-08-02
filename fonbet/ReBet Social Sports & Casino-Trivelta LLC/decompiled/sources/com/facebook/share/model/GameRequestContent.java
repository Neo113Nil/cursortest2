package com.facebook.share.model;

import W9.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.shape.i;
import com.twilio.voice.EventKeys;
import i3.C4527h;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0004\u0012\u0017\u001f\u0014B\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010!\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u0019\u0010'\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0012\u0010&R\u0019\u0010(\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b$\u0010\u0015R\u0019\u0010-\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001f\u0010,R\u001f\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b*\u0010\u001d¨\u00060"}, d2 = {"Lcom/facebook/share/model/GameRequestContent;", "", "Lcom/facebook/share/model/GameRequestContent$b;", "builder", "<init>", "(Lcom/facebook/share/model/GameRequestContent$b;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "a", "Ljava/lang/String;", com.bumptech.glide.gifdecoder.e.f29601m, "()Ljava/lang/String;", "message", com.google.crypto.tink.integration.android.b.f37029b, "cta", "", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "recipients", d.f13160a, i.f35755A, "title", EventKeys.DATA, "Lcom/facebook/share/model/GameRequestContent$a;", "f", "Lcom/facebook/share/model/GameRequestContent$a;", "()Lcom/facebook/share/model/GameRequestContent$a;", "actionType", "objectId", "Lcom/facebook/share/model/GameRequestContent$e;", C4527h.f48087o, "Lcom/facebook/share/model/GameRequestContent$e;", "()Lcom/facebook/share/model/GameRequestContent$e;", "filters", "suggestions", "j", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GameRequestContent implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String message;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String cta;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final List recipients;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String data;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final a actionType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final String objectId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final e filters;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final List suggestions;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new c();

    public enum a {
        SEND,
        ASKFOR,
        TURN,
        INVITE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f31483a;

        /* renamed from: b, reason: collision with root package name */
        public String f31484b;

        /* renamed from: c, reason: collision with root package name */
        public List f31485c;

        /* renamed from: d, reason: collision with root package name */
        public String f31486d;

        /* renamed from: e, reason: collision with root package name */
        public String f31487e;

        /* renamed from: f, reason: collision with root package name */
        public a f31488f;

        /* renamed from: g, reason: collision with root package name */
        public String f31489g;

        /* renamed from: h, reason: collision with root package name */
        public e f31490h;

        /* renamed from: i, reason: collision with root package name */
        public List f31491i;

        public GameRequestContent a() {
            return new GameRequestContent(this, null);
        }

        public final a b() {
            return this.f31488f;
        }

        public final String c() {
            return this.f31484b;
        }

        public final String d() {
            return this.f31486d;
        }

        public final e e() {
            return this.f31490h;
        }

        public final String f() {
            return this.f31483a;
        }

        public final String g() {
            return this.f31489g;
        }

        public final List h() {
            return this.f31485c;
        }

        public final List i() {
            return this.f31491i;
        }

        public final String j() {
            return this.f31487e;
        }

        public final b k(a aVar) {
            this.f31488f = aVar;
            return this;
        }

        public final b l(String str) {
            this.f31486d = str;
            return this;
        }

        public final b m(e eVar) {
            this.f31490h = eVar;
            return this;
        }

        public final b n(String str) {
            this.f31483a = str;
            return this;
        }

        public final b o(String str) {
            this.f31489g = str;
            return this;
        }

        public final b p(List list) {
            this.f31485c = list;
            return this;
        }

        public final b q(List list) {
            this.f31491i = list;
            return this;
        }

        public final b r(String str) {
            this.f31487e = str;
            return this;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GameRequestContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GameRequestContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public GameRequestContent[] newArray(int i10) {
            return new GameRequestContent[i10];
        }
    }

    public enum e {
        APP_USERS,
        APP_NON_USERS,
        EVERYBODY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() {
            e[] valuesCustom = values();
            return (e[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public /* synthetic */ GameRequestContent(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    /* renamed from: a, reason: from getter */
    public final a getActionType() {
        return this.actionType;
    }

    /* renamed from: b, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* renamed from: c, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* renamed from: d, reason: from getter */
    public final e getFilters() {
        return this.filters;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: f, reason: from getter */
    public final String getObjectId() {
        return this.objectId;
    }

    /* renamed from: g, reason: from getter */
    public final List getRecipients() {
        return this.recipients;
    }

    /* renamed from: h, reason: from getter */
    public final List getSuggestions() {
        return this.suggestions;
    }

    /* renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.message);
        out.writeString(this.cta);
        out.writeStringList(this.recipients);
        out.writeString(this.title);
        out.writeString(this.data);
        out.writeSerializable(this.actionType);
        out.writeString(this.objectId);
        out.writeSerializable(this.filters);
        out.writeStringList(this.suggestions);
    }

    public GameRequestContent(b bVar) {
        this.message = bVar.f();
        this.cta = bVar.c();
        this.recipients = bVar.h();
        this.title = bVar.j();
        this.data = bVar.d();
        this.actionType = bVar.b();
        this.objectId = bVar.g();
        this.filters = bVar.e();
        this.suggestions = bVar.i();
    }

    public GameRequestContent(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.message = parcel.readString();
        this.cta = parcel.readString();
        this.recipients = parcel.createStringArrayList();
        this.title = parcel.readString();
        this.data = parcel.readString();
        this.actionType = (a) parcel.readSerializable();
        this.objectId = parcel.readString();
        this.filters = (e) parcel.readSerializable();
        this.suggestions = parcel.createStringArrayList();
    }
}
