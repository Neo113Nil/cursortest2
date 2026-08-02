package io.branch.indexing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* loaded from: classes9.dex */
class HashHelper {
    MessageDigest messageDigest_;

    HashHelper() {
        try {
            this.messageDigest_ = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    String hashContent(String str) {
        MessageDigest messageDigest = this.messageDigest_;
        if (messageDigest != null) {
            messageDigest.reset();
            this.messageDigest_.update(str.getBytes());
            return new String(this.messageDigest_.digest());
        }
        return "";
    }
}
