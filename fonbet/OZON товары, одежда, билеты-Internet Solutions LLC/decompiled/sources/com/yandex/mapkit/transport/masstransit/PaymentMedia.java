package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class PaymentMedia implements Serializable {

    /* renamed from: id, reason: collision with root package name */
    private String f60747id;
    private String name;
    private MediaType type;

    public enum MediaType {
        UNKNOWN,
        CASH,
        PAPER_TICKET,
        TRANSIT_CARD,
        CONTACTLESS_PAYMENT_DEVICE,
        MOBILE_APPLICATION
    }

    public PaymentMedia(@NonNull String str, String str2, @NonNull MediaType mediaType) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (mediaType == null) {
            throw new IllegalArgumentException("Required field \"type\" cannot be null");
        }
        this.f60747id = str;
        this.name = str2;
        this.type = mediaType;
    }

    @NonNull
    public String getId() {
        return this.f60747id;
    }

    public String getName() {
        return this.name;
    }

    @NonNull
    public MediaType getType() {
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f60747id = archive.add(this.f60747id, false);
        this.name = archive.add(this.name, true);
        this.type = (MediaType) archive.add((Archive) this.type, false, (Class<Archive>) MediaType.class);
    }

    public PaymentMedia() {
    }
}
