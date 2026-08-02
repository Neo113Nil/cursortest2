package bet.prediction.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.sports.insider.data.repository.room.live.LiveTable;
import d9.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o9.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v3.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b(\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001HB\u009b\u0001\u0012H\b\u0002\u0010\b\u001aB\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0006\u0018\u00010\u0003j \u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0006\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b\"\u0010#JP\u0010$\u001aB\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0006\u0018\u00010\u0003j \u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0006\u0018\u0001`\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u0015J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u0015J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010\u0015J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÀ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010\u0015J¨\u0001\u0010/\u001a\u00020\u00002H\b\u0002\u0010\b\u001aB\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0006\u0018\u00010\u0003j \u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0006\u0018\u0001`\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b1\u0010\u0015Rb\u0010\b\u001aB\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0006\u0018\u00010\u0003j \u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0006\u0018\u0001`\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u00102\u001a\u0004\b3\u0010%\"\u0004\b4\u00105R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u0015\"\u0004\b8\u00109R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u00106\u001a\u0004\b:\u0010\u0015\"\u0004\b;\u00109R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u00106\u001a\u0004\b<\u0010\u0015\"\u0004\b=\u00109R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010*\"\u0004\b@\u0010AR*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010B\u001a\u0004\bC\u0010,\"\u0004\bD\u0010ER$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0011\u00106\u001a\u0004\bF\u0010\u0015\"\u0004\bG\u00109¨\u0006I"}, d2 = {"Lbet/prediction/response/Http4XX;", "Lv3/a;", "Landroid/os/Parcelable;", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "errors", "msg", "exception", "file", "", "line", "", "Lbet/prediction/response/Http4XX$Trace;", "trace", "stackTrace", "<init>", "(Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;[Lbet/prediction/response/Http4XX$Trace;Ljava/lang/String;)V", "toJsonString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/HashMap;", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6$Betting_123_googleProductionRelease", "()[Lbet/prediction/response/Http4XX$Trace;", "component6", "component7", "copy", "(Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;[Lbet/prediction/response/Http4XX$Trace;Ljava/lang/String;)Lbet/prediction/response/Http4XX;", "toString", "Ljava/util/HashMap;", "getErrors", "setErrors", "(Ljava/util/HashMap;)V", "Ljava/lang/String;", "getMsg", "setMsg", "(Ljava/lang/String;)V", "getException", "setException", "getFile", "setFile", "Ljava/lang/Integer;", "getLine", "setLine", "(Ljava/lang/Integer;)V", "[Lbet/prediction/response/Http4XX$Trace;", "getTrace$Betting_123_googleProductionRelease", "setTrace$Betting_123_googleProductionRelease", "([Lbet/prediction/response/Http4XX$Trace;)V", "getStackTrace", "setStackTrace", "Trace", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Http4XX implements a, Parcelable {

    @NotNull
    public static final Parcelable.Creator<Http4XX> CREATOR = new Creator();

    @b("errors")
    @Nullable
    private HashMap<String, ArrayList<String>> errors;

    @b("exception")
    @Nullable
    private String exception;

    @b("file")
    @Nullable
    private String file;

    @b("line")
    @Nullable
    private Integer line;

    @b(LiveTable.messageColumn)
    @Nullable
    private String msg;

    @Nullable
    private String stackTrace;

    @b("trace")
    @Nullable
    private Trace[] trace;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Http4XX> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Http4XX createFromParcel(Parcel parcel) {
            HashMap hashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Trace[] traceArr = null;
            if (parcel.readInt() == 0) {
                hashMap = null;
            } else {
                int readInt = parcel.readInt();
                HashMap hashMap2 = new HashMap(readInt);
                for (int i5 = 0; i5 != readInt; i5++) {
                    hashMap2.put(parcel.readString(), parcel.createStringArrayList());
                }
                hashMap = hashMap2;
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                traceArr = new Trace[readInt2];
                for (int i10 = 0; i10 != readInt2; i10++) {
                    traceArr[i10] = Trace.CREATOR.createFromParcel(parcel);
                }
            }
            return new Http4XX(hashMap, readString, readString2, readString3, valueOf, traceArr, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Http4XX[] newArray(int i5) {
            return new Http4XX[i5];
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\u0005J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0005R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000e¨\u0006-"}, d2 = {"Lbet/prediction/response/Http4XX$Trace;", "Landroid/os/Parcelable;", "file", "", "line", "", "function", "className", "type", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "setFile", "(Ljava/lang/String;)V", "getLine", "()Ljava/lang/Integer;", "setLine", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFunction", "setFunction", "getClassName", "setClassName", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbet/prediction/response/Http4XX$Trace;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Trace implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Trace> CREATOR = new Creator();

        @b("class")
        @Nullable
        private String className;

        @b("file")
        @Nullable
        private String file;

        @b("function")
        @Nullable
        private String function;

        @b("line")
        @Nullable
        private Integer line;

        @b("type")
        @Nullable
        private String type;

        /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Trace> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Trace createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Trace(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Trace[] newArray(int i5) {
                return new Trace[i5];
            }
        }

        public Trace() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ Trace copy$default(Trace trace, String str, Integer num, String str2, String str3, String str4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = trace.file;
            }
            if ((i5 & 2) != 0) {
                num = trace.line;
            }
            if ((i5 & 4) != 0) {
                str2 = trace.function;
            }
            if ((i5 & 8) != 0) {
                str3 = trace.className;
            }
            if ((i5 & 16) != 0) {
                str4 = trace.type;
            }
            String str5 = str4;
            String str6 = str2;
            return trace.copy(str, num, str6, str3, str5);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getFile() {
            return this.file;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getLine() {
            return this.line;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getFunction() {
            return this.function;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getClassName() {
            return this.className;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final Trace copy(@Nullable String file, @Nullable Integer line, @Nullable String function, @Nullable String className, @Nullable String type) {
            return new Trace(file, line, function, className, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Trace)) {
                return false;
            }
            Trace trace = (Trace) other;
            return Intrinsics.areEqual(this.file, trace.file) && Intrinsics.areEqual(this.line, trace.line) && Intrinsics.areEqual(this.function, trace.function) && Intrinsics.areEqual(this.className, trace.className) && Intrinsics.areEqual(this.type, trace.type);
        }

        @Nullable
        public final String getClassName() {
            return this.className;
        }

        @Nullable
        public final String getFile() {
            return this.file;
        }

        @Nullable
        public final String getFunction() {
            return this.function;
        }

        @Nullable
        public final Integer getLine() {
            return this.line;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.file;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.line;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.function;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.className;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.type;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public final void setClassName(@Nullable String str) {
            this.className = str;
        }

        public final void setFile(@Nullable String str) {
            this.file = str;
        }

        public final void setFunction(@Nullable String str) {
            this.function = str;
        }

        public final void setLine(@Nullable Integer num) {
            this.line = num;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Trace(file=");
            sb2.append(this.file);
            sb2.append(", line=");
            sb2.append(this.line);
            sb2.append(", function=");
            sb2.append(this.function);
            sb2.append(", className=");
            sb2.append(this.className);
            sb2.append(", type=");
            return e.k(sb2, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            int intValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.file);
            Integer num = this.line;
            if (num == null) {
                intValue = 0;
            } else {
                dest.writeInt(1);
                intValue = num.intValue();
            }
            dest.writeInt(intValue);
            dest.writeString(this.function);
            dest.writeString(this.className);
            dest.writeString(this.type);
        }

        public Trace(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.file = str;
            this.line = num;
            this.function = str2;
            this.className = str3;
            this.type = str4;
        }

        public /* synthetic */ Trace(String str, Integer num, String str2, String str3, String str4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? null : num, (i5 & 4) != 0 ? null : str2, (i5 & 8) != 0 ? null : str3, (i5 & 16) != 0 ? null : str4);
        }
    }

    public Http4XX(@Nullable HashMap<String, ArrayList<String>> hashMap, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Trace[] traceArr, @Nullable String str4) {
        String str5;
        this.errors = hashMap;
        this.msg = str;
        this.exception = str2;
        this.file = str3;
        this.line = num;
        this.trace = traceArr;
        this.stackTrace = str4;
        try {
            str5 = new j().f(this, Trace.class).toString();
        } catch (Exception unused) {
            str5 = null;
        }
        setStackTrace(str5);
    }

    public static /* synthetic */ Http4XX copy$default(Http4XX http4XX, HashMap hashMap, String str, String str2, String str3, Integer num, Trace[] traceArr, String str4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            hashMap = http4XX.errors;
        }
        if ((i5 & 2) != 0) {
            str = http4XX.msg;
        }
        if ((i5 & 4) != 0) {
            str2 = http4XX.exception;
        }
        if ((i5 & 8) != 0) {
            str3 = http4XX.file;
        }
        if ((i5 & 16) != 0) {
            num = http4XX.line;
        }
        if ((i5 & 32) != 0) {
            traceArr = http4XX.trace;
        }
        if ((i5 & 64) != 0) {
            str4 = http4XX.stackTrace;
        }
        Trace[] traceArr2 = traceArr;
        String str5 = str4;
        Integer num2 = num;
        String str6 = str2;
        return http4XX.copy(hashMap, str, str6, str3, num2, traceArr2, str5);
    }

    @Nullable
    public final HashMap<String, ArrayList<String>> component1() {
        return this.errors;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getException() {
        return this.exception;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getFile() {
        return this.file;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getLine() {
        return this.line;
    }

    @Nullable
    /* renamed from: component6$Betting_123_googleProductionRelease, reason: from getter */
    public final Trace[] getTrace() {
        return this.trace;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getStackTrace() {
        return this.stackTrace;
    }

    @NotNull
    public final Http4XX copy(@Nullable HashMap<String, ArrayList<String>> errors, @Nullable String msg, @Nullable String exception, @Nullable String file, @Nullable Integer line, @Nullable Trace[] trace, @Nullable String stackTrace) {
        return new Http4XX(errors, msg, exception, file, line, trace, stackTrace);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Http4XX.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type bet.prediction.response.Http4XX");
        Http4XX http4XX = (Http4XX) other;
        if (!Intrinsics.areEqual(getErrors(), http4XX.getErrors()) || !Intrinsics.areEqual(getMsg(), http4XX.getMsg()) || !Intrinsics.areEqual(getException(), http4XX.getException()) || !Intrinsics.areEqual(getFile(), http4XX.getFile()) || !Intrinsics.areEqual(getLine(), http4XX.getLine())) {
            return false;
        }
        Trace[] traceArr = this.trace;
        if (traceArr != null) {
            Trace[] traceArr2 = http4XX.trace;
            if (traceArr2 == null || !Arrays.equals(traceArr, traceArr2)) {
                return false;
            }
        } else if (http4XX.trace != null) {
            return false;
        }
        return Intrinsics.areEqual(getStackTrace(), http4XX.getStackTrace());
    }

    @Nullable
    public HashMap<String, ArrayList<String>> getErrors() {
        return this.errors;
    }

    @Nullable
    public String getException() {
        return this.exception;
    }

    @Nullable
    public String getFile() {
        return this.file;
    }

    @Nullable
    public Integer getLine() {
        return this.line;
    }

    @Override // v3.a
    @Nullable
    public String getMsg() {
        return this.msg;
    }

    @Nullable
    public String getStackTrace() {
        return this.stackTrace;
    }

    @Nullable
    public final Trace[] getTrace$Betting_123_googleProductionRelease() {
        return this.trace;
    }

    public int hashCode() {
        HashMap<String, ArrayList<String>> errors = getErrors();
        int hashCode = (errors != null ? errors.hashCode() : 0) * 31;
        String msg = getMsg();
        int hashCode2 = (hashCode + (msg != null ? msg.hashCode() : 0)) * 31;
        String exception = getException();
        int hashCode3 = (hashCode2 + (exception != null ? exception.hashCode() : 0)) * 31;
        String file = getFile();
        int hashCode4 = (hashCode3 + (file != null ? file.hashCode() : 0)) * 31;
        Integer line = getLine();
        int intValue = (hashCode4 + (line != null ? line.intValue() : 0)) * 31;
        Trace[] traceArr = this.trace;
        int hashCode5 = (intValue + (traceArr != null ? Arrays.hashCode(traceArr) : 0)) * 31;
        String stackTrace = getStackTrace();
        return hashCode5 + (stackTrace != null ? stackTrace.hashCode() : 0);
    }

    public void setErrors(@Nullable HashMap<String, ArrayList<String>> hashMap) {
        this.errors = hashMap;
    }

    public void setException(@Nullable String str) {
        this.exception = str;
    }

    public void setFile(@Nullable String str) {
        this.file = str;
    }

    public void setLine(@Nullable Integer num) {
        this.line = num;
    }

    public void setMsg(@Nullable String str) {
        this.msg = str;
    }

    public void setStackTrace(@Nullable String str) {
        this.stackTrace = str;
    }

    public final void setTrace$Betting_123_googleProductionRelease(@Nullable Trace[] traceArr) {
        this.trace = traceArr;
    }

    @Override // v3.a
    @NotNull
    public String toJsonString() {
        return new j().f(this, Http4XX.class).toString();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Http4XX(errors=");
        sb2.append(this.errors);
        sb2.append(", msg=");
        sb2.append(this.msg);
        sb2.append(", exception=");
        sb2.append(this.exception);
        sb2.append(", file=");
        sb2.append(this.file);
        sb2.append(", line=");
        sb2.append(this.line);
        sb2.append(", trace=");
        sb2.append(Arrays.toString(this.trace));
        sb2.append(", stackTrace=");
        return e.k(sb2, this.stackTrace, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        HashMap<String, ArrayList<String>> hashMap = this.errors;
        if (hashMap == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(hashMap.size());
            for (Map.Entry<String, ArrayList<String>> entry : hashMap.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeStringList(entry.getValue());
            }
        }
        dest.writeString(this.msg);
        dest.writeString(this.exception);
        dest.writeString(this.file);
        Integer num = this.line;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Trace[] traceArr = this.trace;
        if (traceArr == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            int length = traceArr.length;
            dest.writeInt(length);
            for (int i5 = 0; i5 != length; i5++) {
                traceArr[i5].writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.stackTrace);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Http4XX(HashMap hashMap, String str, String str2, String str3, Integer num, Trace[] traceArr, String str4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(hashMap, str, str2, str3, r7, r8, r9);
        String str5;
        Trace[] traceArr2;
        Integer num2;
        hashMap = (i5 & 1) != 0 ? null : hashMap;
        str = (i5 & 2) != 0 ? null : str;
        str2 = (i5 & 4) != 0 ? null : str2;
        str3 = (i5 & 8) != 0 ? null : str3;
        if ((i5 & 16) != 0) {
            str5 = str4;
            traceArr2 = traceArr;
            num2 = null;
        } else {
            str5 = str4;
            traceArr2 = traceArr;
            num2 = num;
        }
    }
}
