package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes9.dex */
public class r {
    private volatile boolean corrupted;
    private ByteString delayedBytes;
    private C5957h extensionRegistry;
    private volatile ByteString memoizedBytes;
    protected volatile MessageLite value;

    public r(C5957h c5957h, ByteString byteString) {
        checkArguments(c5957h, byteString);
        this.extensionRegistry = c5957h;
        this.delayedBytes = byteString;
    }

    private static void checkArguments(C5957h c5957h, ByteString byteString) {
        if (c5957h == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (byteString == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    public static r fromValue(MessageLite messageLite) {
        r rVar = new r();
        rVar.setValue(messageLite);
        return rVar;
    }

    private static MessageLite mergeValueAndBytes(MessageLite messageLite, ByteString byteString, C5957h c5957h) {
        try {
            return messageLite.toBuilder().mergeFrom(byteString, c5957h).build();
        } catch (InvalidProtocolBufferException unused) {
            return messageLite;
        }
    }

    public void clear() {
        this.delayedBytes = null;
        this.value = null;
        this.memoizedBytes = null;
    }

    public int computeMessageSetExtensionSize(int i11) {
        return computeSize(3) + CodedOutputStream.computeUInt32Size(2, i11) + (CodedOutputStream.computeTagSize(1) * 2);
    }

    public int computeSize(int i11) {
        return computeSizeNoTag() + CodedOutputStream.computeTagSize(i11);
    }

    public int computeSizeNoTag() {
        return CodedOutputStream.computeLengthDelimitedFieldSize(getSerializedSize());
    }

    public boolean containsDefaultInstance() {
        ByteString byteString = this.memoizedBytes;
        ByteString byteString2 = ByteString.EMPTY;
        if (byteString == byteString2) {
            return true;
        }
        if (this.value != null) {
            return false;
        }
        ByteString byteString3 = this.delayedBytes;
        return byteString3 == null || byteString3 == byteString2;
    }

    protected void ensureInitialized(MessageLite messageLite) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.delayedBytes != null) {
                    this.value = messageLite.getParserForType().parseFrom(this.delayedBytes, this.extensionRegistry);
                    this.memoizedBytes = this.delayedBytes;
                } else {
                    this.value = messageLite;
                    this.memoizedBytes = ByteString.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.corrupted = true;
                this.value = messageLite;
                this.memoizedBytes = ByteString.EMPTY;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        MessageLite messageLite = this.value;
        MessageLite messageLite2 = rVar.value;
        return (messageLite == null && messageLite2 == null) ? toByteString().equals(rVar.toByteString()) : (messageLite == null || messageLite2 == null) ? messageLite != null ? messageLite.equals(rVar.getValue(messageLite.getDefaultInstanceForType())) : getValue(messageLite2.getDefaultInstanceForType()).equals(messageLite2) : messageLite.equals(messageLite2);
    }

    public int getSerializedSize() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes.size();
        }
        ByteString byteString = this.delayedBytes;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.value != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public MessageLite getValue(MessageLite messageLite) {
        ensureInitialized(messageLite);
        return this.value;
    }

    public int hashCode() {
        return 1;
    }

    boolean isCorrupted() {
        return this.corrupted;
    }

    public void merge(r rVar) {
        ByteString byteString;
        if (rVar.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(rVar);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = rVar.extensionRegistry;
        }
        ByteString byteString2 = this.delayedBytes;
        if (byteString2 != null && (byteString = rVar.delayedBytes) != null) {
            this.delayedBytes = byteString2.concat(byteString);
            return;
        }
        if (this.value == null && rVar.value != null) {
            setValue(mergeValueAndBytes(rVar.value, this.delayedBytes, this.extensionRegistry));
        } else if (this.value == null || rVar.value != null) {
            setValue(this.value.toBuilder().mergeFrom(rVar.value).build());
        } else {
            setValue(mergeValueAndBytes(this.value, rVar.delayedBytes, rVar.extensionRegistry));
        }
    }

    public void mergeFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        if (containsDefaultInstance()) {
            setByteString(codedInputStream.readBytes(), c5957h);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = c5957h;
        }
        ByteString byteString = this.delayedBytes;
        if (byteString != null) {
            setByteString(byteString.concat(codedInputStream.readBytes()), this.extensionRegistry);
        } else {
            try {
                setValue(this.value.toBuilder().mergeFrom(codedInputStream, c5957h).build());
            } catch (InvalidProtocolBufferException unused) {
            }
        }
    }

    public void set(r rVar) {
        this.delayedBytes = rVar.delayedBytes;
        this.value = rVar.value;
        this.memoizedBytes = rVar.memoizedBytes;
        C5957h c5957h = rVar.extensionRegistry;
        if (c5957h != null) {
            this.extensionRegistry = c5957h;
        }
    }

    public void setByteString(ByteString byteString, C5957h c5957h) {
        checkArguments(c5957h, byteString);
        this.delayedBytes = byteString;
        this.extensionRegistry = c5957h;
        this.value = null;
        this.memoizedBytes = null;
    }

    public MessageLite setValue(MessageLite messageLite) {
        MessageLite messageLite2 = this.value;
        this.delayedBytes = null;
        this.memoizedBytes = null;
        this.value = messageLite;
        return messageLite2;
    }

    public ByteString toByteString() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes;
        }
        ByteString byteString = this.delayedBytes;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            try {
                if (this.memoizedBytes != null) {
                    return this.memoizedBytes;
                }
                if (this.value == null) {
                    this.memoizedBytes = ByteString.EMPTY;
                } else {
                    this.memoizedBytes = this.value.toByteString();
                }
                return this.memoizedBytes;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void writeTo(T t2, int i11) throws IOException {
        if (this.memoizedBytes != null) {
            t2.writeBytes(i11, this.memoizedBytes);
            return;
        }
        ByteString byteString = this.delayedBytes;
        if (byteString != null) {
            t2.writeBytes(i11, byteString);
        } else if (this.value != null) {
            t2.writeMessage(i11, this.value);
        } else {
            t2.writeBytes(i11, ByteString.EMPTY);
        }
    }

    public r() {
    }
}
