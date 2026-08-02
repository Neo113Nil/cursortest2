package com.blaze.blazesdk.shared.exceptions;

import androidx.annotation.Keep;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\n\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0015\b\u0004\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/blaze/blazesdk/shared/exceptions/BlazeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", PglCryptUtils.KEY_MESSAGE, "<init>", "(Ljava/lang/String;)V", "a", "b", "com/blaze/blazesdk/shared/exceptions/b", "com/blaze/blazesdk/shared/exceptions/a", "com/blaze/blazesdk/shared/exceptions/c", "FragmentActivityRequiredException", "WidgetNotInitializedException", "MainThreadRequiredException", "CloneFailureException", "RemoteWidgetConfigException", "Lcom/blaze/blazesdk/shared/exceptions/BlazeException$CloneFailureException;", "Lcom/blaze/blazesdk/shared/exceptions/BlazeException$FragmentActivityRequiredException;", "Lcom/blaze/blazesdk/shared/exceptions/BlazeException$MainThreadRequiredException;", "Lcom/blaze/blazesdk/shared/exceptions/BlazeException$RemoteWidgetConfigException;", "Lcom/blaze/blazesdk/shared/exceptions/BlazeException$a;", "Lotl;", "Lfxl;", "Lf1m;", "Lcom/blaze/blazesdk/shared/exceptions/BlazeException$b;", "Lcom/blaze/blazesdk/shared/exceptions/BlazeException$WidgetNotInitializedException;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BlazeException extends Exception {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/blaze/blazesdk/shared/exceptions/BlazeException$CloneFailureException;", "Lcom/blaze/blazesdk/shared/exceptions/BlazeException;", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CloneFailureException extends BlazeException {
        public static final int $stable = 0;

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CloneFailureException(@NotNull String str) {
            super(str, null);
            str.getClass();
            this.message = str;
        }

        public static /* synthetic */ CloneFailureException copy$default(CloneFailureException cloneFailureException, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cloneFailureException.message;
            }
            return cloneFailureException.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final CloneFailureException copy(@NotNull String message) {
            message.getClass();
            return new CloneFailureException(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CloneFailureException) && Intrinsics.c(this.message, ((CloneFailureException) other).message);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return lnb.q(new StringBuilder("CloneFailureException(message="), this.message, ')');
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/shared/exceptions/BlazeException$FragmentActivityRequiredException;", "Lcom/blaze/blazesdk/shared/exceptions/BlazeException;", "<init>", "()V", "readResolve", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FragmentActivityRequiredException extends BlazeException {
        public static final int $stable = 0;

        @NotNull
        public static final FragmentActivityRequiredException INSTANCE = new FragmentActivityRequiredException();

        private FragmentActivityRequiredException() {
            super("The BlazeSDK player require to be embedded inside FragmentActivity.", null);
        }

        private final Object readResolve() {
            return INSTANCE;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/shared/exceptions/BlazeException$MainThreadRequiredException;", "Lcom/blaze/blazesdk/shared/exceptions/BlazeException;", "<init>", "()V", "readResolve", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MainThreadRequiredException extends BlazeException {
        public static final int $stable = 0;

        @NotNull
        public static final MainThreadRequiredException INSTANCE = new MainThreadRequiredException();

        private MainThreadRequiredException() {
            super("This operation must be executed on the main thread.", null);
        }

        private final Object readResolve() {
            return WidgetNotInitializedException.INSTANCE;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/shared/exceptions/BlazeException$WidgetNotInitializedException;", "Lcom/blaze/blazesdk/shared/exceptions/BlazeException;", "<init>", "()V", "readResolve", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WidgetNotInitializedException extends BlazeException {
        public static final int $stable = 0;

        @NotNull
        public static final WidgetNotInitializedException INSTANCE = new WidgetNotInitializedException();

        private WidgetNotInitializedException() {
            super("Widget is not initialized. Call the initWidget() method before using the widget.", null);
        }

        private final Object readResolve() {
            return INSTANCE;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends BlazeException {
        public final String a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Nullable String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.a = str;
        }

        public static a copy$default(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            aVar.getClass();
            return new a(str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.c(this.a, ((a) obj).a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.a;
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return lnb.q(new StringBuilder("RequestBelongsToDifferentUserException(message="), this.a, ')');
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends BlazeException {
        public final String a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Nullable String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.a = str;
        }

        public static b copy$default(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            bVar.getClass();
            return new b(str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.c(this.a, ((b) obj).a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.a;
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return lnb.q(new StringBuilder("UserManagementFailureException(message="), this.a, ')');
        }
    }

    public /* synthetic */ BlazeException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, null);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/blaze/blazesdk/shared/exceptions/BlazeException$RemoteWidgetConfigException;", "Lcom/blaze/blazesdk/shared/exceptions/BlazeException;", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoteWidgetConfigException extends BlazeException {
        public static final int $stable = 0;

        @Nullable
        private final String message;

        public /* synthetic */ RemoteWidgetConfigException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public static /* synthetic */ RemoteWidgetConfigException copy$default(RemoteWidgetConfigException remoteWidgetConfigException, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = remoteWidgetConfigException.message;
            }
            return remoteWidgetConfigException.copy(str);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final RemoteWidgetConfigException copy(@Nullable String message) {
            return new RemoteWidgetConfigException(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RemoteWidgetConfigException) && Intrinsics.c(this.message, ((RemoteWidgetConfigException) other).message);
        }

        @Override // java.lang.Throwable
        @Nullable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return lnb.q(new StringBuilder("RemoteWidgetConfigException(message="), this.message, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteWidgetConfigException() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteWidgetConfigException(@Nullable String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.message = str;
        }
    }

    private BlazeException(String str) {
        super(str);
    }

    public /* synthetic */ BlazeException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
