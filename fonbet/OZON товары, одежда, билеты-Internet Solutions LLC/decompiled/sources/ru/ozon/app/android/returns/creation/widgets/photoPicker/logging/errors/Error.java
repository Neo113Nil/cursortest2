package ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.errors;

import G.g;
import N3.C3660k;
import P4.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0013\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error;", "", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "Picking", "Resizing", "Uploading", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error$Picking;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error$Resizing;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error$Uploading;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class Error extends Throwable {
    private final String message;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error$Picking;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Picking extends Error {
        private final String message;

        public Picking(String str) {
            super(str, null);
            this.message = str;
        }

        @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.errors.Error, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error$Resizing;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error;", "", "message", "filename", "", "fileSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getFilename", "J", "getFileSize", "()J", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Resizing extends Error {
        private final long fileSize;

        @NotNull
        private final String filename;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Resizing(String str, @NotNull String filename, long j11) {
            super(str, null);
            Intrinsics.checkNotNullParameter(filename, "filename");
            this.message = str;
            this.filename = filename;
            this.fileSize = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Resizing)) {
                return false;
            }
            Resizing resizing = (Resizing) other;
            return Intrinsics.d(this.message, resizing.message) && Intrinsics.d(this.filename, resizing.filename) && this.fileSize == resizing.fileSize;
        }

        public final long getFileSize() {
            return this.fileSize;
        }

        @NotNull
        public final String getFilename() {
            return this.filename;
        }

        @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.errors.Error, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            return Long.hashCode(this.fileSize) + g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.filename);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return f.a(this.fileSize, ")", C3660k.d("Resizing(message=", this.message, ", filename=", this.filename, ", fileSize="));
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error$Uploading;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error;", "", "message", "filename", "", "resizedFileSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getFilename", "J", "getResizedFileSize", "()J", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Uploading extends Error {

        @NotNull
        private final String filename;
        private final String message;
        private final long resizedFileSize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Uploading(String str, @NotNull String filename, long j11) {
            super(str, null);
            Intrinsics.checkNotNullParameter(filename, "filename");
            this.message = str;
            this.filename = filename;
            this.resizedFileSize = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Uploading)) {
                return false;
            }
            Uploading uploading = (Uploading) other;
            return Intrinsics.d(this.message, uploading.message) && Intrinsics.d(this.filename, uploading.filename) && this.resizedFileSize == uploading.resizedFileSize;
        }

        @NotNull
        public final String getFilename() {
            return this.filename;
        }

        @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.errors.Error, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public final long getResizedFileSize() {
            return this.resizedFileSize;
        }

        public int hashCode() {
            String str = this.message;
            return Long.hashCode(this.resizedFileSize) + g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.filename);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return f.a(this.resizedFileSize, ")", C3660k.d("Uploading(message=", this.message, ", filename=", this.filename, ", resizedFileSize="));
        }
    }

    public /* synthetic */ Error(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private Error(String str) {
        super(str);
        this.message = str;
    }
}
