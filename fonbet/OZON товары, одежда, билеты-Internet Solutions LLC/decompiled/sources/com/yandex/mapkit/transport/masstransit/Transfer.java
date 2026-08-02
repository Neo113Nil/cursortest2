package com.yandex.mapkit.transport.masstransit;

import F3.G;
import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class Transfer implements Serializable {
    private List<ConstructionSegment> constructions;
    private boolean constructions__is_initialized;
    private NativeObject nativeObject;
    private TransferStop transferStop;
    private boolean transferStop__is_initialized;

    public Transfer() {
        this.constructions__is_initialized = false;
        this.transferStop__is_initialized = false;
    }

    private native List<ConstructionSegment> getConstructions__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Transfer";
    }

    private native TransferStop getTransferStop__Native();

    private native NativeObject init(List<ConstructionSegment> list, TransferStop transferStop);

    @NonNull
    public synchronized List<ConstructionSegment> getConstructions() {
        try {
            if (!this.constructions__is_initialized) {
                this.constructions = getConstructions__Native();
                this.constructions__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.constructions;
    }

    @NonNull
    public synchronized TransferStop getTransferStop() {
        try {
            if (!this.transferStop__is_initialized) {
                this.transferStop = getTransferStop__Native();
                this.transferStop__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.transferStop;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getConstructions(), false, (ArchivingHandler) new ClassHandler(ConstructionSegment.class));
            archive.add((Archive) getTransferStop(), false, (Class<Archive>) TransferStop.class);
            return;
        }
        this.constructions = G.d(ConstructionSegment.class, archive, this.constructions, false);
        this.constructions__is_initialized = true;
        TransferStop transferStop = (TransferStop) archive.add((Archive) this.transferStop, false, (Class<Archive>) TransferStop.class);
        this.transferStop = transferStop;
        this.transferStop__is_initialized = true;
        this.nativeObject = init(this.constructions, transferStop);
    }

    public Transfer(@NonNull List<ConstructionSegment> list, @NonNull TransferStop transferStop) {
        this.constructions__is_initialized = false;
        this.transferStop__is_initialized = false;
        if (list == null) {
            throw new IllegalArgumentException("Required field \"constructions\" cannot be null");
        }
        if (transferStop != null) {
            this.nativeObject = init(list, transferStop);
            this.constructions = list;
            this.constructions__is_initialized = true;
            this.transferStop = transferStop;
            this.transferStop__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"transferStop\" cannot be null");
    }

    private Transfer(NativeObject nativeObject) {
        this.constructions__is_initialized = false;
        this.transferStop__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
