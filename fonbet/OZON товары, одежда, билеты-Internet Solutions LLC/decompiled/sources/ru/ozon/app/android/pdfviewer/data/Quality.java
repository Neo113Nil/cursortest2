package ru.ozon.app.android.pdfviewer.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdfviewer/data/Quality;", "", "", "ratio", "<init>", "(I)V", "I", "getRatio", "()I", "Normal", "Lru/ozon/app/android/pdfviewer/data/Quality$Normal;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class Quality {
    private final int ratio;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdfviewer/data/Quality$Normal;", "Lru/ozon/app/android/pdfviewer/data/Quality;", "<init>", "()V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Normal extends Quality {

        @NotNull
        public static final Normal INSTANCE = new Normal();

        private Normal() {
            super(2, null);
        }
    }

    public /* synthetic */ Quality(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    public final int getRatio() {
        return this.ratio;
    }

    private Quality(int i11) {
        this.ratio = i11;
    }
}
